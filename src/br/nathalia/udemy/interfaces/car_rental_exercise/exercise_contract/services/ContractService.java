package br.nathalia.udemy.interfaces.car_rental_exercise.exercise_contract.services;

import br.nathalia.udemy.interfaces.car_rental_exercise.exercise_contract.entities.Contract;
import br.nathalia.udemy.interfaces.car_rental_exercise.exercise_contract.entities.Installment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ContractService {
    private Contract contract;
    private OnlinePaymentService onlinePaymentService;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ContractService(Contract contract, OnlinePaymentService onlinePaymentService) {
        this.contract = contract;
        this.onlinePaymentService = onlinePaymentService;
    }

    public List<Installment> processContract() {
        Double amount = contract.getContractValue() / contract.getInstallments();
        List<Installment> installments = new ArrayList<>();
        for (int i = 1; i <= contract.getInstallments(); i++) {
            Double installmentValue = onlinePaymentService.calculateInstallment(amount, i);
            LocalDate date = contract.getDate().plusMonths(i);

            installments.add(new Installment(date, installmentValue));
        }
        return installments;
    }
}

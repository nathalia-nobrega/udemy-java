package br.nathalia.udemy.interfaces.exercise_contract.services;

import br.nathalia.udemy.interfaces.exercise_contract.entities.Contract;
import br.nathalia.udemy.interfaces.exercise_contract.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        for (int i = 1; i <= months; i++) {
            Double interestRateAmount = onlinePaymentService.interestRate(contract.getContractValue() / months, i);
            Double installmentValue = onlinePaymentService.paymentFee(interestRateAmount);
            LocalDate dueDate = contract.getDate().plusMonths(i);
            contract.getInstallments().add(new Installment(dueDate, installmentValue));
        }
    }
}

package br.nathalia.udemy.interfaces.exercise_contract.application;

import br.nathalia.udemy.interfaces.exercise_contract.entities.Contract;
import br.nathalia.udemy.interfaces.exercise_contract.services.ContractService;
import br.nathalia.udemy.interfaces.exercise_contract.services.PayPalPaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // config
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract's data: ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
        System.out.print("Enter contract value: ");
        Double value = sc.nextDouble();
        System.out.print("Enter number of installments: ");
        Integer installments = sc.nextInt();
        Contract contract = new Contract(number, value, date);

        ContractService contractService = new ContractService(new PayPalPaymentService());
        contractService.processContract(contract, installments);

        System.out.println("\nInstallments: ");
        contract.getInstallments().forEach(System.out::println);

        sc.close();

    }
}

package br.nathalia.udemy.exceptions.class_177_exercise.model.application;

import br.nathalia.udemy.exceptions.class_177_exercise.model.entities.Account;
import br.nathalia.udemy.exceptions.class_177_exercise.model.entities.Holder;
import br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions.AmountExceededWithdrawLimitException;
import br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions.AmountGreaterThanBalanceException;
import br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions.BalanceIsEmptyException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // config
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // holder data
        System.out.println("Enter holder data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        Holder holder = new Holder(name);

        // account data
        System.out.println("\nEnter account data: ");
        System.out.print("Initial balance: ");
        double initBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double wLimit = sc.nextDouble();
        Account account = new Account(holder, initBalance, wLimit);
        System.out.println("\nYour account information: ");
        System.out.println(account);

        // withdraw
        System.out.println("\n***** WITHDRAW *****");
        System.out.print("\nEnter ammount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("New balance: "+account.getinitialBalance());
        } catch (BalanceIsEmptyException | AmountExceededWithdrawLimitException | AmountGreaterThanBalanceException e) {
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}

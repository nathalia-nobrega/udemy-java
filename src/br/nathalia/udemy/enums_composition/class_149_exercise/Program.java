package br.nathalia.udemy.enums_composition.class_149_exercise;

import br.nathalia.udemy.enums_composition.class_149_exercise.entities.Department;
import br.nathalia.udemy.enums_composition.class_149_exercise.entities.HourContract;
import br.nathalia.udemy.enums_composition.class_149_exercise.entities.Worker;
import br.nathalia.udemy.enums_composition.class_149_exercise.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // configs
        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        // department data
        System.out.print("Enter the department's name: ");
        String depName = sc.nextLine();
        Department department = new Department(depName);

        // worker's data
        System.out.println("Enter the worker's data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        System.out.print("How many contracts to this worker? ");
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, department);


        int contractsNumber = sc.nextInt();
        // contract's data
        for (int i = 1; i <= contractsNumber; i++) {
            System.out.println("\nEnter contract #" + i + " data:");
            System.out.print("Date(dd/MM/yyyy): ");
            String contractDate = sc.next();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            worker.getContracts().add(new HourContract(LocalDate.parse(contractDate, dtf), valuePerHour, hours));
        }

        // processing data
        System.out.print("\nEnter month and year to calculate income (MM/yyyy): ");
        List<Integer> monthYear = Arrays.stream(sc.next().split("/")).map(Integer::valueOf).toList();
        Double income = worker.income(monthYear.get(1), monthYear.get(0));


        // output
        System.out.println("\nName: " + workerName);
        System.out.println("Department: " + department.getName());
        System.out.println("Income for " + monthYear.get(0) + "/" + monthYear.get(1) + ": " + income);


        sc.close();
    }
}

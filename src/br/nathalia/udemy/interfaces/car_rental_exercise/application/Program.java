package br.nathalia.udemy.interfaces.car_rental_exercise.application;

import br.nathalia.udemy.interfaces.car_rental_exercise.model.entities.CarRental;
import br.nathalia.udemy.interfaces.car_rental_exercise.model.entities.Vehicle;
import br.nathalia.udemy.interfaces.car_rental_exercise.model.services.BrazilTaxService;
import br.nathalia.udemy.interfaces.car_rental_exercise.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the vehicle's data:");
        System.out.print("Vehicle's model: ");
        String model = sc.nextLine();
        Vehicle vehicle = new Vehicle(model);
        System.out.print("Withdrawal (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
        CarRental carRental = new CarRental(start, finish, vehicle);

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();
        RentalService service = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        service.processInvoice(carRental);

        System.out.println("Basic payment: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Tax: " + carRental.getInvoice().getTax());
        System.out.println("Total payment: " + carRental.getInvoice().getTotalPayment());

        sc.close();
    }
}

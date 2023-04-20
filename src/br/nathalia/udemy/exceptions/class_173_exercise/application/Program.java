package br.nathalia.udemy.exceptions.class_173_exercise.application;

import br.nathalia.udemy.exceptions.class_173_exercise.model.entities.Reservation;
import br.nathalia.udemy.exceptions.class_173_exercise.model.exceptions.CheckOutNotValidException;
import br.nathalia.udemy.exceptions.class_173_exercise.model.exceptions.ReservationDateBeforePresentMomentException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // config
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // input
        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkin = LocalDate.parse(sc.next(), dtf);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkout = LocalDate.parse(sc.next(), dtf);
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println(reservation);

            System.out.println("\nEnter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkinUpdate = LocalDate.parse(sc.next(), dtf);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkoutUpdate = LocalDate.parse(sc.next(), dtf);
            reservation.updateDates(checkinUpdate, checkoutUpdate);

            System.out.println(reservation);

        } catch (InputMismatchException |
                 DateTimeParseException |
                 CheckOutNotValidException |
                 ReservationDateBeforePresentMomentException e) {
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}

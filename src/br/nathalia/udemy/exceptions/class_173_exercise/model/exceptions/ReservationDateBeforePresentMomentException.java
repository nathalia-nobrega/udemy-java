package br.nathalia.udemy.exceptions.class_173_exercise.model.exceptions;

public class ReservationDateBeforePresentMomentException extends Exception {
    public ReservationDateBeforePresentMomentException() {
        super("Error updating the reservation: Reservation dates must be after the present moment");
    }
}

package br.nathalia.udemy.exceptions.class_173_exercise.model.exceptions;

public class CheckOutNotValidException extends Exception {
    public CheckOutNotValidException() {
        super("Error updating the reservation: Check-out date must be after check-in date");
    }
}

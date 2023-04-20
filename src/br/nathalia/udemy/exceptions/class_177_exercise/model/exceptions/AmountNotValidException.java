package br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions;

public class AmountNotValidException extends Exception {
    public AmountNotValidException() {
        super("Error trying to deposit: amount must be greater than 0");
    }
}

package br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions;

public class AmountGreaterThanBalanceException extends Exception {
    public AmountGreaterThanBalanceException() {
        super("Not enough balance.");
    }
}

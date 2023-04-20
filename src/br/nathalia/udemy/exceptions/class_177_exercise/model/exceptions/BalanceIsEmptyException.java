package br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions;

public class BalanceIsEmptyException extends Exception {
    public BalanceIsEmptyException() {
        super("Error trying to withdraw: this account has no balance.");
    }
}

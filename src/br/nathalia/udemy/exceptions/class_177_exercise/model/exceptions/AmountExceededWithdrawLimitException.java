package br.nathalia.udemy.exceptions.class_177_exercise.model.exceptions;

public class AmountExceededWithdrawLimitException extends Exception {
    public AmountExceededWithdrawLimitException() {
        super("Error trying to withdraw: the amount exceeds withdraw limit.");
    }
}

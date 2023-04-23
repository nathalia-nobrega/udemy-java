package br.nathalia.udemy.interfaces.exercise_contract.services;

public interface OnlinePaymentService {
    Double interestRate(Double amount, Integer month);
    Double paymentFee(Double amount);

}

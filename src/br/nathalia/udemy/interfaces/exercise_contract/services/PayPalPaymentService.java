package br.nathalia.udemy.interfaces.exercise_contract.services;

public class PayPalPaymentService implements OnlinePaymentService {
    static final Double INTEREST_RATE = 0.01;
    static final Double TAX = 0.02;

    @Override
    public Double interestRate(Double amount, Integer month) {
        return amount + (amount * INTEREST_RATE * month);
    }

    @Override
    public Double paymentFee(Double amount) {
        return amount + (amount * TAX);
    }
}

package br.nathalia.udemy.interfaces.car_rental_exercise.exercise_contract.services;

public class PayPalPaymentService implements OnlinePaymentService {
    static final Double INTEREST_RATE = 0.01;
    static final Double TAX = 0.02;

    @Override
    public Double calculateInstallment(Double amount, Integer installment) {
        double amountInterest = amount + (amount * INTEREST_RATE * installment);
        return amountInterest + (amountInterest * TAX);
    }
}

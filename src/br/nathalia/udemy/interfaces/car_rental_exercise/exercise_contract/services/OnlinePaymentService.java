package br.nathalia.udemy.interfaces.car_rental_exercise.exercise_contract.services;

public interface OnlinePaymentService {
    Double calculateInstallment(Double amount, Integer installments);
}

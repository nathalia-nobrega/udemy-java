package br.nathalia.udemy.interfaces.car_rental_exercise.model.services;

public class BrazilTaxService implements TaxService{
    @Override
    public Double tax(Double amount) {
        if (amount < 100.0) {
            return 0.2 * amount;
        }
        return 0.15 * amount;
    }
}

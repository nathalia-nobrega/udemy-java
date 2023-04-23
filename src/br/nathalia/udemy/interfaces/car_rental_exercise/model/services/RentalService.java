package br.nathalia.udemy.interfaces.car_rental_exercise.model.services;

import br.nathalia.udemy.interfaces.car_rental_exercise.model.entities.CarRental;
import br.nathalia.udemy.interfaces.car_rental_exercise.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;
    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental cr) {
        System.out.println("\nINVOICE: ");
        double hours = Duration.between(cr.getStart(), cr.getFinish()).toMinutes() / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);
        cr.setInvoice(new Invoice(basicPayment, tax));
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    @Override
    public String toString() {
        return "RentalService{" +
                "pricePerDay=" + pricePerDay +
                ", pricePerHour=" + pricePerHour +
                ", taxService=" + taxService +
                '}';
    }
}

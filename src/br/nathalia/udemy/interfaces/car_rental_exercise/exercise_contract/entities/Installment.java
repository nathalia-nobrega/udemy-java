package br.nathalia.udemy.interfaces.car_rental_exercise.exercise_contract.entities;

import java.time.LocalDate;

public class Installment {
    private LocalDate date;
    private Double value;

    public Installment() {
    }

    public Installment(LocalDate date, Double value) {
        this.date = date;
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return date + " - " + value;
    }
}

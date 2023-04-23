package br.nathalia.udemy.interfaces.car_rental_exercise.model.entities;

public class Vehicle {
    private String model;

    public Vehicle() {
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }
}

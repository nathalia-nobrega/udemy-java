package br.nathalia.udemy.interfaces.car_rental_exercise.exercise_contract.entities;

import java.time.LocalDate;

public class Contract {
    private Integer contractNumber;
    private Double contractValue;
    private LocalDate date;
    private Integer installments;

    public Contract() {
    }

    public Contract(Integer contractNumber, Double contractValue, LocalDate date, Integer installments) {
        this.contractNumber = contractNumber;
        this.contractValue = contractValue;
        this.date = date;
        this.installments = installments;
    }

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Double getContractValue() {
        return contractValue;
    }

    public void setContractValue(Double contractValue) {
        this.contractValue = contractValue;
    }
    public LocalDate getDate() {
        return date;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", contractValue=" + contractValue +
                ", installments=" + installments +
                '}';
    }
}

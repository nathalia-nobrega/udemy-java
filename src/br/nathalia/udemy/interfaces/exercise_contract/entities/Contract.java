package br.nathalia.udemy.interfaces.exercise_contract.entities;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Contract {
    private Integer contractNumber;
    private Double contractValue;
    private LocalDate date;
    private Set<Installment> installments = new LinkedHashSet<>();

    public Contract() {
    }

    public Contract(Integer contractNumber, Double contractValue, LocalDate date) {
        this.contractNumber = contractNumber;
        this.contractValue = contractValue;
        this.date = date;
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

    public Set<Installment> getInstallments() {
        return installments;
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

package br.nathalia.udemy.enums_composition.class_152_exercise.entities;

import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

    public Client() {
    }

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthLocal() {
        return birthDate;
    }

    public void setBirthLocalDate(LocalDate birthLocalDate) {
        this.birthDate = birthLocalDate;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getBirthLocal() + ")" + " - " + this.getEmail();
    }
}

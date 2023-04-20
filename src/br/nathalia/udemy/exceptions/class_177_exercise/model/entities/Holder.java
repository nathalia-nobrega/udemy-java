package br.nathalia.udemy.exceptions.class_177_exercise.model.entities;

import java.util.concurrent.ThreadLocalRandom;

public class Holder {
    private Long id;
    private String name;

    public Holder() {
    }

    public Holder(String name) {
        id = ThreadLocalRandom.current().nextLong(0, 999);
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

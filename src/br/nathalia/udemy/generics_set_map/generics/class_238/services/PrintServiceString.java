package br.nathalia.udemy.generics_set_map.generics.class_238.services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceString<String> implements PrintService<String> {

    private List<String> strings = new ArrayList<>();

    @Override
    public void add(String value) {
        strings.add(value);
    }

    @Override
    public String first() {
        return strings.get(0);
    }

    @Override
    public void print() {
        strings.forEach(System.out::println);
    }
}

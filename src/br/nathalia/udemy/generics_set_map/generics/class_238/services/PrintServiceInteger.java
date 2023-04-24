package br.nathalia.udemy.generics_set_map.generics.class_238.services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceInteger<Integer> implements PrintService<Integer> {
    private List<Integer> integers = new ArrayList<>();

    @Override
    public void add(Integer value) {
        integers.add(value);
    }

    @Override
    public Integer first() {
        return integers.get(0);
    }

    @Override
    public void print() {
        integers.forEach(System.out::println);
    }
}

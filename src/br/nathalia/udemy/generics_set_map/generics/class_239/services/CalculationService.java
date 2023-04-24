package br.nathalia.udemy.generics_set_map.generics.class_239.services;

import java.util.Collections;
import java.util.List;

public class CalculationService {

    public static <T extends Object & Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) throw new IllegalStateException();
        return Collections.max(list);
    }

}

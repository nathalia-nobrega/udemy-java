package br.nathalia.udemy.generics_set_map.generics.class_238.services;

public interface PrintService<T> {
    void add(T value);
    T first();
    void print();
}

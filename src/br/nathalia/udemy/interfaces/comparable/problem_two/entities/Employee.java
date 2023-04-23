package br.nathalia.udemy.interfaces.comparable.problem_two.entities;

public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + ", " + salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getSalary().compareTo(o.getSalary());
    }
}

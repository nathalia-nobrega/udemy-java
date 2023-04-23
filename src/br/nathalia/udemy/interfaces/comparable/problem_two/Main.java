package br.nathalia.udemy.interfaces.comparable.problem_two;

import br.nathalia.udemy.interfaces.comparable.problem_two.entities.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final File file = new File("");

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();

            while (line != null) {
                String[] split = line.split(",");
                employees.add(new Employee(split[0], Double.valueOf(split[1])));
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        employees.sort(Comparator.reverseOrder());
        employees.forEach(System.out::println);
    }
}

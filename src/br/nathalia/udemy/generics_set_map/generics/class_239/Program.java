package br.nathalia.udemy.generics_set_map.generics.class_239;

import br.nathalia.udemy.generics_set_map.generics.class_239.entities.Product;
import br.nathalia.udemy.generics_set_map.generics.class_239.services.CalculationService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\tmp\\products.csv");
        List<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                String[] split = line.split(",");
                products.add(new Product(split[0], Double.valueOf(split[1])));
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Max price = "+ CalculationService.max(products));


    }
}

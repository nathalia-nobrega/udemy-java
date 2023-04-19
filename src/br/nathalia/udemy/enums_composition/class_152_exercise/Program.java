package br.nathalia.udemy.enums_composition.class_152_exercise;

import br.nathalia.udemy.enums_composition.class_152_exercise.entities.Client;
import br.nathalia.udemy.enums_composition.class_152_exercise.entities.Order;
import br.nathalia.udemy.enums_composition.class_152_exercise.entities.OrderItem;
import br.nathalia.udemy.enums_composition.class_152_exercise.entities.Product;
import br.nathalia.udemy.enums_composition.class_152_exercise.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // configs
        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        // client data
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (dd/MM/yyyy): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), dtf);
        Client client = new Client(name, email, birthDate);

        // order data
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.next();
        System.out.print("How many items to this order? ");
        int i = sc.nextInt();
        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status));

        // order item data
        for (int j = 1; j <= i; j++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String prodName = sc.nextLine();
            System.out.print("Product price: ");
            double prodPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            order.getItems().add(new OrderItem(new Product(prodName, prodPrice), quantity));
        }

        // output
        System.out.println("\nORDER SUMMARY: ");
        System.out.println(order);
        System.out.println("Client: " + client);
        order.getItems().forEach(System.out::println);
        System.out.print("Total price: " + order.total());


        sc.close();
    }
}

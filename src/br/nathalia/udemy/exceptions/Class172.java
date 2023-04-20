package br.nathalia.udemy.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Class172 {
    public static void main(String[] args) {
        File file = new File("C:\\tmp\\catalogs.csv");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            sc.nextLine();
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed!");
        }
    }
}

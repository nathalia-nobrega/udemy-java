package br.nathalia.udemy.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Class170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End of program");
        sc.close();
    }
}

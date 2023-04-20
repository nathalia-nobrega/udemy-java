package br.nathalia.udemy.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Class171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        method(sc);

        System.out.println("End of program");
        sc.close();
    }

    private static void method2(Scanner sc) {
        System.out.println("*** METHOD 2 START ****");
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("*** METHOD 2 END ****");
    }


    private static void method(Scanner sc) {
        System.out.println("*** METHOD 1 START ****");
        method2(sc);
        System.out.println("*** METHOD 1 END ****");
    }
}

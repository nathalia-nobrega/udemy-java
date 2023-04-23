package br.nathalia.udemy.interfaces.comparable.problem_one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final File file = new File("src/br/nathalia/udemy/interfaces/comparable/hardcode.txt");
        List<String> songs = new ArrayList<>();

        try (BufferedReader bfr = new BufferedReader(new FileReader(file))) {
            String line = bfr.readLine();
            while (line != null) {
                songs.add(line);
                line = bfr.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        songs.sort(Comparator.naturalOrder());
        songs.forEach(System.out::println);
    }
}

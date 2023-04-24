package br.nathalia.udemy.generics_set_map.generics.class_238;

import br.nathalia.udemy.generics_set_map.generics.class_238.services.PrintService;
import br.nathalia.udemy.generics_set_map.generics.class_238.services.PrintServiceString;

public class Program {
    public static void main(String[] args) {
        PrintService<String> strings = new PrintServiceString<>();

        strings.add("Nathalia");
        strings.add("Nélio");
        strings.add("Nell");
        System.out.println(strings.first());
        strings.print();
    }
}

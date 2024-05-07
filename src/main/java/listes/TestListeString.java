package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        System.out.println(list.stream().max(Comparator.comparingInt(String::length)).get());
        
        list = list.stream().map(String::toUpperCase).toList();
        System.out.println(list);

        list = list.stream().filter(city -> !city.startsWith("N")).toList();
        // list.removeIf(city -> city.startsWith("N")); // Plus optimisé
        System.out.println(list);
    }
}

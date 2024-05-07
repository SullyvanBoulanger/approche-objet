package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestVilles {
    public static void main(String[] args) {
        List<Ville> list = new ArrayList<>(Arrays.asList(
            new Ville("Nice", 343_000), 
            new Ville("Carcassonne", 47_800), 
            new Ville("Narbonne", 53_400), 
            new Ville("Lyon", 484_000), 
            new Ville("Foix", 9_700), 
            new Ville("Pau", 77_200), 
            new Ville("Marseille", 850_700), 
            new Ville("Tarbes", 40_600)
        ));

        System.out.println(
            list.stream().max(Comparator.comparing(Ville::getNumberOfInhabitants)).get());

        list.remove(list.stream().min(Comparator.comparing(Ville::getNumberOfInhabitants)).get());

        list = list.stream().map(city -> {
            if(city.getNumberOfInhabitants() > 100_000)
                city.setName(city.getName().toUpperCase());
            return city;
        }).toList();

        System.out.println(list);
    }
}

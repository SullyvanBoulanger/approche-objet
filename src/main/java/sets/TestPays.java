package sets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class TestPays {
    public static void main(String[] args) {
        Set<Pays> countries = new HashSet<>(Arrays.asList(
            new Pays("USA", 331_000_000, 67_000), 
            new Pays("France", 67_000_000, 45_000), 
            new Pays("Allemagne", 83_000_000, 56_000), 
            new Pays("UK", 68_000_000, 46_000), 
            new Pays("Italie", 60_000_000, 40_000), 
            new Pays("Japon", 126_000_000, 43_000), 
            new Pays("Chine", 1_400_000_000, 11_000), 
            new Pays("Russie", 146_000_000, 29_000), 
            new Pays("Inde", 1_400_000_000, 2_200)
        ));

        System.out.println(countries.stream().max(Comparator.comparingDouble(Pays::getPIBPerInhabitant)).get());
        System.out.println(countries.stream().max(Comparator.comparingDouble(Pays::getPIBPerInhabitant)).get());

        Pays minPibTotal = countries.stream().min(Comparator.comparingDouble(Pays::getTotalPib)).get();
        minPibTotal.setName(minPibTotal.getName().toUpperCase());
        System.out.println(countries);
        
        countries.remove(minPibTotal);
        System.out.println(countries);


    }
}

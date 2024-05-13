package maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import listes.Ville;


public class MapVilles {
    public static void main(String[] args) {
        Map<String, Ville> map = new HashMap<>();
        map.put("Nice",new Ville("Nice", 343_000)); 
        map.put("Carcassonne",new Ville("Carcassonne", 47_800)); 
        map.put("Narbonne",new Ville("Narbonne", 53_400)); 
        map.put("Lyon",new Ville("Lyon", 484_000)); 
        map.put("Foix",new Ville("Foix", 9_700)); 
        map.put("Pau",new Ville("Pau", 77_200)); 
        map.put("Marseille",new Ville("Marseille", 850_700)); 
        map.put("Tarbes",new Ville("Tarbes", 40_600));

        map.remove(
            map.values().stream().min(Comparator.comparing(Ville::getNumberOfInhabitants)).get().getName()
        );

        map.values().forEach(city -> System.out.println(city));
    }
}

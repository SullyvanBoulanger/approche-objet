package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        List<Pays> list = new ArrayList<>(Arrays.asList(
            new Pays("France", 65_000_000, "Europe"), 
            new Pays("Allemagne", 80_000_000, "Europe"), 
            new Pays("Belgique", 10_000_000, "Europe"), 
            new Pays("Russie", 150_000_000, "Asie"), 
            new Pays("Chine", 1_400_000_000, "Asie"), 
            new Pays("Indonésie", 220_000_000, "Océanie"), 
            new Pays("Australie", 20_000_000, "Océanie") 
        ));

        Map<String, Long> map = new HashMap<>();
        
        list.forEach(country -> {
            if(!map.containsKey(country.getContinent())){
                map.put(
                    country.getContinent(), 
                    list.stream().filter(c -> c.getContinent() == country.getContinent()).count()
                );
            }
        });

        map.keySet().forEach(key -> System.out.println(key + " : " + map.get(key)));
    }
}

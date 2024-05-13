package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {
    public static void main(String[] args) {
        Map<String, Double> mapSalaires = new HashMap<>();
        mapSalaires.put("Paul", Double.valueOf(1750));
        mapSalaires.put("Hicham", Double.valueOf(1825));
        mapSalaires.put("Yu", Double.valueOf(2250));
        mapSalaires.put("Ingrid", Double.valueOf(2015));
        mapSalaires.put("Chantal", Double.valueOf(2418));

        System.out.println(mapSalaires.size());
    }
}

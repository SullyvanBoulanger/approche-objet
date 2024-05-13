package tri;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestVille {
    public static void main(String[] args) {
        
        Path home = Paths.get("/home/sully/Documents/DiginamicFormation/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-objet/src/main/java/fichier/");
        Path path = home.resolve("recensement.csv");
        List<Ville> cities = new ArrayList<>();
        
        try {
            List<String> lines = Files.readAllLines(path);
            lines.remove(0);
            
            lines.forEach(line -> {
                String[] splittedLine = line.split(";");
                cities.add(new Ville(
                    splittedLine[6], 
                    splittedLine[2], 
                    splittedLine[1], 
                    Integer.parseInt(splittedLine[9].replaceAll(" ", ""))
                ));
            });

            List<Ville> mutableCities = new ArrayList<>(cities.stream().limit(50).toList());

            Collections.sort(mutableCities);

            mutableCities.forEach(city -> System.out.println(city));
            
            ComparatorHabitant comparatorHabitant = new ComparatorHabitant();
            Collections.sort(mutableCities, comparatorHabitant);
            
            System.out.println("-----Sort By Inhabitants-----");
            mutableCities.forEach(city -> System.out.println(city));
            
            ComparatorNom comparatorNom = new ComparatorNom();
            Collections.sort(mutableCities, comparatorNom);
            
            System.out.println("-----Sort By Name-----");
            mutableCities.forEach(city -> System.out.println(city));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

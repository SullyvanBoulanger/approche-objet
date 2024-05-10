package fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) {
        // Absolute Path
        // Path path = Paths.get("/home/sully/Documents/DiginamicFormation/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-objet/src/main/java/fichier/recensement.csv");
        
        // Relative Path
        // Path path = Paths.get("./src/main/java/fichier/recensement.csv");
        
        Path home = Paths.get("/home/sully/Documents/DiginamicFormation/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-objet/src/main/java/fichier/");
        Path path = home.resolve("recensement.csv");
        ArrayList<Ville> cities = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(path);
            lines.remove(0);

            lines.forEach(line -> System.out.println(line));
            
            lines.forEach(line -> {
                String[] splittedLine = line.split(";");
                cities.add(new Ville(
                    splittedLine[6], 
                    splittedLine[2], 
                    splittedLine[1], 
                    Integer.parseInt(splittedLine[9].replaceAll(" ", ""))
                ));
            });

            List<String> linesToWrite = new ArrayList<>();
            linesToWrite.add("Nom de la commune;Code département;Nom de la région;Population totale;");
            linesToWrite.addAll(cities.stream()
                .filter(city -> city.getNumberOfInhabitants() > 25_000)
                .map(city -> city.toCSV(';'))
                .toList()
            );

            Files.write(home.resolve("cities-over-25k-inhabitants.csv"), 
                linesToWrite, 
                StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

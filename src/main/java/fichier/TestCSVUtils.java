package fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestCSVUtils {
    public static void main(String[] args) {
        Path home = Paths.get("/home/sully/Documents/DiginamicFormation/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-objet/src/main/java/fichier/");
        Path path = home.resolve("recensement.csv");
        ArrayList<Ville> cities = new ArrayList<>();

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

            List<String> linesToWrite = CSVUtils.toCSV(
                path, 
                cities.stream()
                    .filter(city -> city.getNumberOfInhabitants() > 25_000)
                    .collect(Collectors.toList()),
                Ville.class
            );

            Files.write(home.resolve("cities-csv-utils-over-25k-inhabitants.csv"), 
                linesToWrite, 
                StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

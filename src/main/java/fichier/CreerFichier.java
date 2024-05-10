package fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) {

        Path home = Paths.get("/home/sully/Documents/DiginamicFormation/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-objet/src/main/java/fichier/");
        Path path = home.resolve("recensement.csv");

        try {
            List<String> lines = Files.readAllLines(path);
            List<String> linesToWrite = lines.stream().limit(100).toList();
            Files.write(home.resolve("100-first-lines.csv"), linesToWrite, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

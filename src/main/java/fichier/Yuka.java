package fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Yuka {

    private static List<String> generateCSVFile(List<Food> foods){
        List<String> alreadyPassed = new ArrayList<>();
        List<String> linesToWrite = new ArrayList<>();

        List<Food> sortedFoods = foods.stream().sorted(Comparator.comparing(Food::getCategory)).toList();

        for (Food food : sortedFoods) {
            String foodLabel = food.getBrand() + food.getCategory() + food.getRank();

            if(alreadyPassed.contains(foodLabel))
                continue;
            
            linesToWrite.add(food.toCSV(';', foods.stream().filter(f -> food.equals(f)).count()));
            alreadyPassed.add(foodLabel);
        }

        return linesToWrite;
    }

    public static void main(String[] args) {
        Path home = Paths.get("/home/sully/Documents/DiginamicFormation/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-objet/src/main/java/fichier/");
        Path path = home.resolve("open-food-facts.csv");

        try {
            List<String> lines = Files.readAllLines(path);
            lines.remove(0);

            List<Food> foods = lines.stream().map(line -> {
                String[] splittedLine = line.split("\\|");
                return new Food(
                    splittedLine[0], 
                    splittedLine[1], 
                    splittedLine[3]
                );
            }).toList();

            Files.write(home.resolve("food-ranking.csv"), generateCSVFile(foods), StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

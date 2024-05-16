package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        List<Ville> cities = new ArrayList<>();
        cities.add(new Ville("New York", 8_336_000, Continent.AMERIQUE));
        cities.add(new Ville("Paris", 2_161_000, Continent.EUROPE));
        cities.add(new Ville("Pékin", 21_540_000, Continent.ASIE));
        cities.add(new Ville("Moscou", 13_000_000, Continent.ASIE));
        cities.add(new Ville("Berlin", 3_645_000, Continent.EUROPE));
        cities.add(new Ville("Sydney", 5_312_000, Continent.OCEANIE));
        cities.add(new Ville("Sao Paulo", 12_330_000, Continent.AMERIQUE));
        cities.add(new Ville("Dakar", 1_056_009, Continent.AFRIQUE));
    
        cities.forEach(System.out::println);
    }
}

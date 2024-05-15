package listes;

import java.util.Objects;

public class Ville {
    private String name;
    private int numberOfInhabitants;

    public Ville(String name, int numberOfInhabitants) {
        this.name = name;
        this.numberOfInhabitants = numberOfInhabitants;
    }

    public String getName() {
        return name;
    }
    
    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + numberOfInhabitants + " habitants";
    }

    @Override
    public boolean equals(Object arg0) {
        if(!(arg0 instanceof Ville)){
            return false;
        }

        Ville otherCity = (Ville) arg0;

        return Objects.equals(name, otherCity.name) &&
            Objects.equals(numberOfInhabitants, otherCity.numberOfInhabitants);
    }
}

package fr.diginamic.testenumeration;

import java.util.Objects;

public class Ville {
    private String name;
    private int numberOfInhabitants;
    private Continent continent;

    public Ville(String name, int numberOfInhabitants, Continent continent) {
        this.name = name;
        this.numberOfInhabitants = numberOfInhabitants;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }
    
    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return name + " " + continent.getLabel() + " " + numberOfInhabitants + " habitants";
    }

    @Override
    public boolean equals(Object arg0) {
        if(arg0 instanceof Ville otherCity)
            return Objects.equals(name, otherCity.name) &&
                Objects.equals(numberOfInhabitants, otherCity.numberOfInhabitants);
        
        return false;
    }
}

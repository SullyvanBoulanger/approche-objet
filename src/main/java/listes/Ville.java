package listes;

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
}

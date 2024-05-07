package sets;

public class Pays {
    private String name;
    private int numberOfInhabitants;
    private double PIBPerInhabitant;

    public Pays(String name, int numberOfInhabitants, double PIBPerInhabitant) {
        this.name = name;
        this.numberOfInhabitants = numberOfInhabitants;
        this.PIBPerInhabitant = PIBPerInhabitant;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public double getPIBPerInhabitant() {
        return PIBPerInhabitant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalPib(){
        return PIBPerInhabitant * numberOfInhabitants;
    }

    @Override
    public String toString() {
        return name + " " + numberOfInhabitants + " habitants avec " + PIBPerInhabitant + " PIB/habitant";
    }
}

package fichier;

public class Ville {
    private String name;
    private String zipCode;
    private String regionName;
    private int numberOfInhabitants;

    public Ville(String name, String zipCode, String regionName, int numberOfInhabitants) {
        this.name = name;
        this.zipCode = zipCode;
        this.regionName = regionName;
        this.numberOfInhabitants = numberOfInhabitants;
    }

    public String getName() {
        return name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public int getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public String toCSV(char separator){
        return name + separator + zipCode + separator + regionName + separator + numberOfInhabitants;
    }
}
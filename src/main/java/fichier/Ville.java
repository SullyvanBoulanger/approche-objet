package fichier;

public class Ville {
    @CSV(columnName = "Nom de la commune", order = 0)
    private String name;
    @CSV(columnName = "Code département", order = 1)
    private String zipCode;
    @CSV(columnName = "Nom de la région", order = 2)
    private String regionName;
    @CSV(columnName = "Population totale", order = 3)
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

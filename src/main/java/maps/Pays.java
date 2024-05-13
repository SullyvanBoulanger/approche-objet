package maps;

public class Pays {
    private String name;
    private long numberOfInhabitants;
    private String continent;

    public Pays(String name, long numberOfInhabitants, String continent) {
        this.name = name;
        this.numberOfInhabitants = numberOfInhabitants;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public long getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public String getContinent() {
        return continent;
    }
}

package fr.diginamic.testenumeration;

public enum Continent {
    AMERIQUE("Amérique"),
    EUROPE("Europe"),
    ASIE("Asie"),
    AFRIQUE("Afrique"),
    OCEANIE("Océanie");

    private String label;

    private Continent(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

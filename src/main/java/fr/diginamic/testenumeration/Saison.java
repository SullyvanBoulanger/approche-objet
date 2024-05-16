package fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Éte", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String label;
    private int order;

    private Saison(String label, int order) {
        this.label = label;
        this.order = order;
    }

    public String getLabel() {
        return label;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return label + " " + order;
    }

    public static Saison fromLabel(String label){
        for(Saison saison: values()){
            if(saison.label.equals(label))
                return saison;
        }
        throw new IllegalArgumentException("Il n'y a pas de saison nommée " + label);
    }
}

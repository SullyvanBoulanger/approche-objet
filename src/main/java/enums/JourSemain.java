package enums;

public enum JourSemain {
    
    LUNDI("Lundi", 1),
    MARDI("Mardi", 2),
    MERCREDI("Mercredi", 3),
    JEUDI("Jeudi", 4),
    VENDREDI("Vendredi", 5),
    SAMEDI("Samedi", 6),
    DIMANCHE("Dimanche", 7),
    ;

    private String name;
    private int id;

    private JourSemain(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

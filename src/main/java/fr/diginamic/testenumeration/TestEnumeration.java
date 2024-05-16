package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        for(Saison saison: Saison.values()){
            System.out.println(saison);
        }

        String nom = "ETE";
        System.out.println(Saison.valueOf(nom));
        
        String label = "Hiver";
        System.out.println(Saison.fromLabel(label));


    }
}

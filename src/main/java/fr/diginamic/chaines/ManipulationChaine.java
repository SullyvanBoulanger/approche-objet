package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        System.out.println("Longueur : " + chaine.length());
        System.out.println("Index du premier ';' : " + chaine.indexOf(";"));
        System.out.println("Substring : " + chaine.substring(0, 6));

        String lastName = chaine.substring(chaine.indexOf(";")+1, chaine.indexOf(";", chaine.indexOf(";")+1));
        System.out.println("Uppercase : " + lastName.toUpperCase());
        System.out.println("Lowercase : " + lastName.toLowerCase());

        System.out.println(Arrays.toString(chaine.split(";")));

        String[] salarie = chaine.split(";");
        Salarie marcel = new Salarie(
            salarie[0], 
            salarie[1], 
            Double.parseDouble(salarie[2].replace(" ", ""))
        );

        
    }
}

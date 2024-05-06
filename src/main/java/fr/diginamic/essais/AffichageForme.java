package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
    public static void afficher(Forme shape){
        System.out.println(
            "Périmètre : " + shape.calculerPerimetre() 
            + " Surface : " + shape.calculerSurface());
    }
}

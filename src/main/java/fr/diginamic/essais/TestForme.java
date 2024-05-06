package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {
    public static void main(String[] args) {
        Cercle circle = new Cercle(2.5);
        Rectangle rectangle = new Rectangle(3, 6);
        Carre square = new Carre(5);

        AffichageForme.afficher(circle);
        AffichageForme.afficher(rectangle);
        AffichageForme.afficher(square);
    }
}

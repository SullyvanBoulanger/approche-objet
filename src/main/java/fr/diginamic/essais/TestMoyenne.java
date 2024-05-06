package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne calculMoyenne1 = new CalculMoyenne();
        CalculMoyenne calculMoyenne2 = new CalculMoyenne();

        calculMoyenne1.ajout(2.5);
        calculMoyenne1.ajout(2.5);
        calculMoyenne1.ajout(2.5);
        calculMoyenne1.ajout(2.5);
        calculMoyenne1.ajout(2.5);

        calculMoyenne2.ajout(1);
        calculMoyenne2.ajout(2);
        calculMoyenne2.ajout(3);
        calculMoyenne2.ajout(4);
        calculMoyenne2.ajout(5);

        System.out.println(calculMoyenne1.calcul());
        System.out.println(calculMoyenne2.calcul());
    }
}

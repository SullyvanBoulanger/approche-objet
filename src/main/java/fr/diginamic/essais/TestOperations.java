package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        System.out.println("Add : " + Operations.calcul(4, 3, '+'));
        System.out.println("Soustract : " + Operations.calcul(4, 3, '-'));
        System.out.println("Multiply : " + Operations.calcul(4, 3, '*'));
        System.out.println("Divide : " + Operations.calcul(4, 3, '/'));
        System.out.println("Illegal : " + Operations.calcul(4, 3, '$'));
    }
}

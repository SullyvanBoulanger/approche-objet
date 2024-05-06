package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] array = new double[0];

    public void ajout(double valueToAdd){
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1] = valueToAdd;
    }

    public double calcul(){
        double total = 0;

        for (double d : array) {
            total += d;
        }

        return total/array.length;
    }
}

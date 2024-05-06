package fr.diginamic.operations;

public class Operations {
    public static double calcul(double arg0, double arg1, char operator) throws IllegalArgumentException{
        switch (operator) {
            case '+':
                return arg0 + arg1;
            case '-': 
                return arg0 - arg1;
            case '*': 
                return arg0 * arg1;
            case '/': 
                return arg0 / arg1;
            default:
                throw new IllegalArgumentException("Illegal operator");
        }
    }
}

package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {
    
    public static void main(String[] args) {
        Cercle circle1 = new Cercle(2.5);
        Cercle circle2 = new Cercle(3.9);
        
        System.out.println(
            "Périmètre : " + circle1.getPerimeter() 
            + " Surface : " + circle1.getArea());
        
        System.out.println(
            "Périmètre : " + circle2.getPerimeter() 
            + " Surface : " + circle2.getArea());
    }
}

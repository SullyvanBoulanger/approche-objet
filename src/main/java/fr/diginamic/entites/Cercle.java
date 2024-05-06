package fr.diginamic.entites;

public class Cercle {
    private double radius;

    public Cercle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return radius * 2;
    }

    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
}

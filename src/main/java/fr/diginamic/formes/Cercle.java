package fr.diginamic.formes;

public class Cercle extends Forme {

    private double rayon;

    public Cercle(double rayon) {
        super();
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return rayon * 2;
    }

    @Override
    public double calculerPerimetre() {
        return Math.pow(rayon, 2) * Math.PI;
    }
    
}

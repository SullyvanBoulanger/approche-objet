package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double remunerationRates;

    public CompteTaux(int id, int balance, double remunerationRates) {
        super(id, balance);
        this.remunerationRates = remunerationRates;
    }

    @Override
    public String toString() {
        return super.toString() + "; Remuneration rates : " + remunerationRates;
    }
    
}

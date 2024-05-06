package fr.diginamic.entites;

public class Theatre {
    private String name;
    private int max;
    private int numberOfRegisteredCustomers;
    private double amount;

    public Theatre(String name, int max) {
        this.name = name;
        this.max = max;
    }

    public void inscrire(int numberOfCustomers, double pricePerPlace) throws IllegalStateException {
        if(numberOfRegisteredCustomers + numberOfCustomers > max)
            throw new IllegalStateException(name + " is full");
        
        numberOfRegisteredCustomers += numberOfCustomers;
        amount += numberOfCustomers * pricePerPlace;
    }

    public double getAmount() {
        return amount;
    }

    public int getNumberOfRegisteredCustomers() {
        return numberOfRegisteredCustomers;
    }
}

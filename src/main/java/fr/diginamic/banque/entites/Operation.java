package fr.diginamic.banque.entites;

public abstract class Operation {
    private String date;
    private double amount;

    public Operation(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public abstract String getType();
}

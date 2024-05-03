package fr.diginamic.banque.entites;

public class Compte {
    private int id;
    private int balance;

    public Compte(int id, int balance){
        this.id = id;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    
    public int getId() {
        return id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Id : " + id + "; Balance : " + balance;
    }
}

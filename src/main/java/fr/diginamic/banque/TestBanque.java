package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte account = new Compte(1, 500);

        System.out.println(account);
    }
}

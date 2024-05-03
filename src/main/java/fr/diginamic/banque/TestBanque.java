package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte account = new Compte(1, 500);

        System.out.println(account);

        Compte[] accounts = new Compte[2];
        accounts[0] = new Compte(2, 300);
        accounts[1] = new Compte(3, 400);

        for (Compte compte : accounts) {
            System.out.println(compte);
        }
    }
}

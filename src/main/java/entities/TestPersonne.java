package entities;

import entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale a1 = new AdressePostale();
        a1.streetNumber = 7;
        a1.streetLabel = "Rue des chats";
        a1.zipCode = 66677;
        a1.city = "Paradise";
        
        AdressePostale a2 = new AdressePostale();
        a2.streetNumber = 6;
        a2.streetLabel = "Rue des renards";
        a2.zipCode = 77766;
        a2.city = "Forêt";

        Personne p1 = new Personne();
        p1.lastName = "Boulanger";
        p1.firstName = "Sullyvan";
        p1.address = a1;

        Personne p2 = new Personne();
        p2.lastName = "Divinity";
        p2.firstName = "Project:";
        p2.address = a2;
    }
}

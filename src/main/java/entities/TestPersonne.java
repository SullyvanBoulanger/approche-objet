package entities;

import entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale a1 = new AdressePostale(
            7,
            "Rue des chats",
            66677,
            "Paradise"
        );
        
        AdressePostale a2 = new AdressePostale(
            6,
            "Rue des renards",
            77766,
            "Forêt"
        );

        Personne p1 = new Personne(
            "Boulanger",
            "Sullyvan"
        );

        p1.setAddress(a1);

        Personne p2 = new Personne(
            "Divinity",
            "Project:"
        );

        p2.setAddress(a2);
    }
}

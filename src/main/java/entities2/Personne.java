package entities2;

import entities.AdressePostale;

public class Personne {
    public String lastName;
    public String firstName;
    public AdressePostale address;

    public Personne(String lastName, String firstName, AdressePostale adressePostale){
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = adressePostale;
    }
}

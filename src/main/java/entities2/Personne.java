package entities2;

import entities.AdressePostale;

public class Personne {
    public String lastName;
    public String firstName;
    public AdressePostale address;

    public Personne(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void showName(){
        System.out.println(firstName + " " + lastName.toUpperCase());
    }

    public void setLastName(String lastName){
        this.lastName = lastName; 
    }

    public void setFirstName(String firstName){
        this.firstName = firstName; 
    }

    public void setAddress(AdressePostale address){
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public AdressePostale getAddress() {
        return address;
    }
}

package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Paradis des chats !", 5);

        theatre.inscrire(1, 1.5);
        theatre.inscrire(1, 2.5);
        theatre.inscrire(1, 3.5);
        theatre.inscrire(2, 4.5);
        // Will throw an exception
        // theatre.inscrire(2, 5.5);

        System.out.println(theatre.getNumberOfRegisteredCustomers());
        System.out.println(theatre.getAmount());
    }
}

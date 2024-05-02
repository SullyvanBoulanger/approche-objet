package entities;

public class TestAdressePostale {
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
    }
}

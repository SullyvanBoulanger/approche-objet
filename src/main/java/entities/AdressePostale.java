package entities;

public class AdressePostale {
    int streetNumber;
    String streetLabel;
    int zipCode;
    String city;

    public AdressePostale(int streetNumber, String streetLabel, int zipCode, String city) {
        this.streetNumber = streetNumber;
        this.streetLabel = streetLabel;
        this.zipCode = zipCode;
        this.city = city;
    }
}

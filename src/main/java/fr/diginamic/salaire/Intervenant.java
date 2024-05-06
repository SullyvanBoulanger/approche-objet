package fr.diginamic.salaire;

public abstract class Intervenant {
    private String firstName;
    private String lastName;

    public Intervenant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract double getSalary();

    public void printOutData(){
        System.out.println(
            firstName + " " +
            lastName + " " +
            getSalary() + " " +
            getClass()
        );
    }
}

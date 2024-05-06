package fr.diginamic.salaire;

public class Salarie extends Intervenant {

    private double salary;

    public Salarie(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
    
}

package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

    private double workDays;
    private double salaryPerDay;

    public Pigiste(String firstName, String lastName, double workDays, double salaryPerDay) {
        super(firstName, lastName);
        this.workDays = workDays;
        this.salaryPerDay = salaryPerDay;
    }

    @Override
    public double getSalary() {
        return workDays * salaryPerDay;
    }
    
}

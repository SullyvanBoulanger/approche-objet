package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("Chat", "Mignon", 900);
        Pigiste pigiste = new Pigiste("Matou", "Majestueux", 15, 200);

        System.out.println(salarie.getSalary());
        System.out.println(pigiste.getSalary());

        salarie.printOutData();
        pigiste.printOutData();
    }
}

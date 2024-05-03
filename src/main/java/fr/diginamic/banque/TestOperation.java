package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        operations[0] = new Debit("03/05/2024", 500);
        operations[1] = new Credit("02/05/2024", 800);
        operations[2] = new Debit("01/05/2024", 700);
        operations[3] = new Credit("04/05/2024", 600);
        
        int total = 0;
        for (Operation operation : operations) {
            System.out.println("Date : " + operation.getDate()
                + " Amount : " + operation.getAmount()
                + " Type : " + operation.getType()
            );
            if (operation instanceof Debit) {
                total -= operation.getAmount();
            } else if (operation instanceof Credit){
                total += operation.getAmount();
            }
        }

        System.out.println(total);
    }
}

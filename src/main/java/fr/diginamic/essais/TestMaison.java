package fr.diginamic.essais;

import java.util.Arrays;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        for(int i =0; i<11; i++){
            int randomType = (int) Math.round(Math.random() * 5);
            int randomSuperficie = (int) Math.round(Math.random() * 50);
            int randomEtage = (int) Math.round(Math.random() * 2);
            Piece pieceToAdd;
            switch (randomType) {
                case 0:
                    pieceToAdd = new Chambre(randomEtage, randomSuperficie);
                    break;
                case 1:
                    pieceToAdd = new Cuisine(randomEtage, randomSuperficie);
                    break;
                case 2:
                    pieceToAdd = new SalleDeBain(randomEtage, randomSuperficie);
                    break;
                case 3:
                    pieceToAdd = new Salon(randomEtage, randomSuperficie);
                    break;
                case 4:
                    pieceToAdd = new WC(randomEtage, randomSuperficie);
                    break;
                default:
                    pieceToAdd = new Chambre(randomEtage, randomSuperficie);
                    break;
            }

            maison.ajouterPiece(pieceToAdd);
        }

        System.out.println("Superficie Totale : " + maison.getSuperficieTotale());
        System.out.println("Superficie Par Etage 0 : " + maison.getSuperficieParEtage(0));
        System.out.println("Superficie Par Etage 1 : " + maison.getSuperficieParEtage(1));
        System.out.println("Superficie Par Etage 2 : " + maison.getSuperficieParEtage(2));
        System.out.println("Superficie Par Etage 3 : " + maison.getSuperficieParEtage(3));
        
        Class<? extends Piece>[] classes = new Class[5];
        classes[0] = Chambre.class;
        classes[1] = Cuisine.class;
        classes[2] = SalleDeBain.class;
        classes[3] = Salon.class;
        classes[4] = WC.class;

        for (Class<? extends Piece> class1 : classes) {
            System.out.println(class1.toString());
            String[] splitedClass = class1.toString().split("\\.");
            System.out.println(Arrays.toString(splitedClass));
            String className = splitedClass[splitedClass.length - 1];
            System.out.println("Superficie pour " + className + " : " + maison.getSuperficieParTypePiece(class1));
            System.out.println("Nombre de pièces pour " + className + " : " + maison.getNbPiecesParTypePiece(class1));
        }
    }
}

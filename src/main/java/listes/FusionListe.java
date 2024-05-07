package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");
        //TODO Développements à réaliser ci-dessous

        // Impossible à faire sur une ligne où en utilisant des lambdas :(
        List<String> liste3 = new ArrayList<>();
        liste3.addAll(liste1);
        liste3.addAll(liste2);
        
        
        List<String> liste4 = new ArrayList<>();
        liste1.forEach(color -> liste4.add(color));
        liste2.forEach(color -> liste4.add(color));
    }
}

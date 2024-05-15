package listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville v1 = new Ville("Lille", 236_782);
        Ville v2 = new Ville("Lille", 236_782);
        Ville v3 = new Ville("Villeneuve d'Ascq", 62_067);
        Ville v4 = v1;

        if(v1.equals(v2))
            System.out.println("v1 et v2 sont identiques");

        if(!v1.equals(v3))
            System.out.println("v1 et v3 ne sont pas identiques");

        if(v1 != v2)
            System.out.println("v1 et v2 n'ont pas la même référence mémoire");

        if(v1 == v4)
            System.out.println("v1 et v4 ont la même référence mémoire");
    }
}

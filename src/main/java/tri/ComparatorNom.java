package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville>{

    @Override
    public int compare(Ville arg0, Ville arg1) {
        return arg0.getName().compareTo(arg1.getName());
    }
    
}

package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville>{

    @Override
    public int compare(Ville arg0, Ville arg1) {
        return arg1.getNumberOfInhabitants() - arg0.getNumberOfInhabitants();
    }
    
}

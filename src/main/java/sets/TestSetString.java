package sets;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        Set<String> setStrings = new HashSet<>(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

        setStrings.remove(setStrings.stream().max(Comparator.comparingInt(String::length)).get());
        System.out.println(setStrings);
    }
}

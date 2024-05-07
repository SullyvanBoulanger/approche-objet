package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

        System.out.println(list);
        System.out.println(list.size());
        
        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
        Optional<Integer> max2 = list.stream().collect(Collectors.maxBy(Integer::compareTo));

        if(max.isPresent())
            System.out.println(max.getAsInt());
        if(max2.isPresent())
            System.out.println(max2.get());

        list.remove(list.stream().collect(Collectors.minBy(Integer::compareTo)).get());
        System.out.println(list);

        list = list.stream().map(Math::abs).toList();
        System.out.println(list);
    }
}

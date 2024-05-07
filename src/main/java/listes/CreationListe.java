package listes;

import java.util.List;
import java.util.stream.IntStream;

public class CreationListe {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 1000).boxed().toList();
        // ArrayList<Integer> arrayList = IntStream.range(0, 1000).boxed().collect(Collectors.toList());

        System.out.println(list);
    }
}

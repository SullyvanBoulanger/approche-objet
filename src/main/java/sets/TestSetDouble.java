package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> doubles = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

        System.out.println(doubles);

        Optional<Double> max = doubles.stream().collect(Collectors.maxBy(Double::compareTo));

        if(max.isPresent())
            System.out.println(max.get());

        doubles.remove(doubles.stream().mapToDouble(Double::doubleValue).min().getAsDouble());
        System.out.println(doubles);
    }
}

package chaines;

public class TestStringbuilder {
    public static int ITERATIONS = 100_000;

    public static void TestStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < ITERATIONS; j++) {
            stringBuilder.append(j);
        }
        stringBuilder.toString();
    }

    public static void TestStringConcat() {
        String string = "";
        for (int j = 0; j < ITERATIONS; j++) {
            string = string.concat(String.valueOf(j));
        }
    }
    
    public static void TestStringPlus() {
        String string = "";
        for (int j = 0; j < ITERATIONS; j++) {
            string += j;
        }
    }

    public static void measureExecutionTime(Runnable task) {
        long start = System.currentTimeMillis();
        task.run();
        long end = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (end - start));
    }

    public static void main(String[] args) {
        System.out.println("String Plus");
        measureExecutionTime(() -> TestStringPlus());

        System.out.println("String Concat");
        measureExecutionTime(() -> TestStringConcat());

        System.out.println("String Builder");
        measureExecutionTime(() -> TestStringBuilder());
    }
}

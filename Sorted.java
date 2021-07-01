import java.util.Arrays;

public class Sorted {

    /**
     * ex.
     * javac Sorted.java
     * java Sorted 2 50 45
     * 2
     * 45
     * 50
     */
    public static void main(String[] args) {
         Arrays.asList(args)
               .stream()
               .mapToInt(p -> Integer.valueOf(p))
               .sorted()
               .forEach(System.out::println);  // Method reference
    }
}

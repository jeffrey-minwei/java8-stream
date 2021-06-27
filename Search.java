import java.util.List;
import java.util.Arrays;

public class Search {
    
    public static void main(String[] args) {
       
         Arrays.asList(args)
               .stream()
               .filter(p -> p.startsWith("-"))
               .forEach(System.out::println);  // Method reference

         Arrays.asList(args)
               .stream()
               .filter(p -> p.startsWith("-"))
               .forEach(i -> System.out.println(i));  // lambda expression
    }
}

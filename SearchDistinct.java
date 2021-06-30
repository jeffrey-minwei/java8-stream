import java.util.List;
import java.util.Arrays;

public class SearchDistinct {
    
    public static void main(String[] args) {
       
         List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 3});

         list.stream()
             .distinct()
             .forEach(System.out::println);  // Method reference
    }
}

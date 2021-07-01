import java.util.List;
import java.util.Arrays;

public class SearchCount {
    
    public static void main(String[] args) {
       
         long count = Arrays.asList(args)
                            .stream()
                            .distinct()
                            .count();
         System.out.println(count);
    }
}

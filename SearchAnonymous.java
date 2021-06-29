import java.util.List;
import java.util.Arrays;

public class SearchAnonymous {
    
    public static void main(String[] args) {
         Checker checker = new Checker() {
             public boolean test(String str){
                 Integer age = Integer.valueOf(str);
                 return age >= 1 && age < 18;
             }
         };
         Arrays.asList(args)
               .stream()
               .filter(p -> checker.test(p))
               .forEach(System.out::println);
    }
}

interface Checker {
    boolean test(String str);
}


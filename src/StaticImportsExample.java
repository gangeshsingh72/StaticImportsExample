
// Static import of System.out
import static java.lang.System.* ;

public class StaticImportsExample {
    public static void main(String[] args) {
        int min = Math.min(5, 7);

        // out is used directly without System due to static import 
        out.println("min=" + min);
        out.println(Math.PI);

     //   printConfig();
    }

}

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollExample9 {
    public static void main(String[] args) {
        Collection<String> collection
                = Arrays.asList("red","cyan","red");
        System.out.println(
                Collections.frequency(collection, "red"));

    }
}

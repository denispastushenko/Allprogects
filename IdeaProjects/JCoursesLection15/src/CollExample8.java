import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollExample8 {
    public static void main(String[] args) {
        Collection<String> collection1
                = Arrays.asList("red","cyan");
        Collection<String> collection2
                = Arrays.asList("red","blue");
        Collection<String> collection3
                = Arrays.asList("pink","tan");
        System.out.println(
                Collections.disjoint(collection1, collection2));
        System.out.println(
                Collections.disjoint(collection1, collection3));

    }
}

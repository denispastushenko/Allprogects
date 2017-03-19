import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("red","green","blue");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        List<String> list2 = Arrays.asList("green","red","yellow","blue");
        System.out.println(list2);
        Collections.sort(list2,Collections.reverseOrder());
        System.out.println(list2);
        Collections.shuffle(list2);
        System.out.println(list2);

    }
}

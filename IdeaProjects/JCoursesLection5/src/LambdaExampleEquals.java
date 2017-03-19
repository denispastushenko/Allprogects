import java.util.Scanner;
import java.util.stream.Stream;


public class LambdaExampleEquals {
    public static void main(String[] args) {
        Stream.of(new Scanner(System.in).next().split(" "))
             //   .filter(s-> ArrayUtils.isSorted(s.getBytes()))
                .forEach(System.out::println);
    }
}

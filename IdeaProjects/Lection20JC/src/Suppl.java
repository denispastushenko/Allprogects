import java.util.Optional;

public class Suppl {
    public static void main(String[] args) {
        Optional<String> as = Optional.of("asd");
       as.isPresent(((s)-> System.out.println(s.charAt(0)))) ;
    }
}

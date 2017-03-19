import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Double> hm = new TreeMap<>();

        hm.put("John Doe", (3334.45));
        hm.put("Tom Smith", (34.45));
        hm.put("Jane Ro", 4564.45);
        hm.put("Den Yi", (3678.45));
        hm.put("Mao Li", (45.45));
        hm.put("Lio Chan", (3123.45));

        Set<Map.Entry<String, Double>> set = hm.entrySet();//ссылка на меп и его внутреннюю реализацию; Зделано для того чтобы стелать перебор значений(итераций) Так как понятие итератора для меп несуществует.
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " +
                hm.get("John Doe"));
    }


}


import java.util.Arrays;
import java.util.TreeSet;

public class Testing {
    public static void main(String[] args) {
        TreeSet<Persone> persones = new TreeSet<>();
        Persone[] persons = new Persone[4];
        persons[0] = new Persone();
        persons[0].setFirstName("Elvis");
        persons[0].setLastName("Goodyear");
        persons[0].setAge(56);
        persons[1] = new Persone();
        persons[1].setFirstName("Stanley");
        persons[1].setLastName("Clark");
        persons[1].setAge(8);
        persons[2] = new Persone();
        persons[2].setFirstName("Jane");
        persons[2].setLastName("Graff");
        persons[2].setAge(16);
        persons[3] = new Persone();
        persons[3].setFirstName("Nancy");
        persons[3].setLastName("Goodyear");
        persons[3].setAge(69);
        System.out.println("Natural Order");
        for (int i = 0; i < 4; i++) {
            Persone person = persons[i];
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            int age = person.getAge();
            System.out.println(lastName + ", " + firstName + ". Age:" + age);
        }
        Arrays.sort(persons);
        System.out.println();
        System.out.println("Sorted by age");
        for (int i = 0; i < 4; i++) {
            Persone person = persons[i];
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            int age = person.getAge();
            System.out.println(lastName + ", " + firstName + ". Age:" + age);
       // persones.add(Arrays.deepToString(person));
        }
        System.out.println(persones);
    }

}


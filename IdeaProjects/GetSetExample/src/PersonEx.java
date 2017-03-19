/**
 * Created by Denys on 5/24/2016.
 */
public class PersonEx {
    public static void main(String[] args) {
        Person person = new Person("Johny");
        System.out.println(person.getName());
        person.printPesronName(person);
        person.setName("Billy Jin");
        person.printPesronName(person);
        System.out.println(person.getNumOfPeople());
        System.out.println(person.summary("Idy ", "na huy"));
    }
}

/**
 * Created by Denys on 5/24/2016.
 */
public class Person {
    protected String name;
    protected static int numOfPeople = 0;

    public Person(String name) {
        this.name = name;
        numOfPeople++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void printPesronName(Person person){
        System.out.println(person.getName());
    }
    public int getNumOfPeople(){
        return numOfPeople;
    }
    public String summary(String a, String b){
        return a.concat(b);
    }
}

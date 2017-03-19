
public class Persone implements Comparable {
    private String firstName;
    private String LastName;
    private int age;


    public String getFirstName(){
        return firstName;

    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLastName() {

        return LastName;
    }

    public void  setFirstName(String firstName){
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public int compareTo(Object anotherPerson)
            throws ClassCastException {
        if (!(anotherPerson instanceof Persone))
            throw new ClassCastException(
                    "A Person object expected.");
        int anotherPersonAge =
                ((Persone) anotherPerson).getAge();
        return this.age - anotherPersonAge;
    }


}

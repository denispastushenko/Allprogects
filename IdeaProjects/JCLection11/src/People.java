
public class People {
    String name;int age;double paymant;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", paymant=" + paymant +
                '}';
    }

    public People(String name, int age, double paymant) {
        this.name = name;
        this.age = age;
        this.paymant = paymant;
    }
}

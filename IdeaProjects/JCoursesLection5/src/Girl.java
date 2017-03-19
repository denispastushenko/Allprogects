
public class Girl {
    String colorEyes;
    String getColorHair;
    String name;
    int age;



    void goToCinema(){
        System.out.println("Ok");
    }
    void igoToRestaurant(String rest){
        if (rest.equals("Mac"))
            System.out.println("No");
        else System.out.println("Yes");
    }

    public Girl(String colorEyes, String getColorHair, String name, int age) {
        this.colorEyes = colorEyes;
        this.getColorHair = getColorHair;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "colorEyes='" + colorEyes + '\'' +
                ", getColorHair='" + getColorHair + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

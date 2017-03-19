
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("HI");
            throw new myExeption("Baba");
        } catch (myExeption myExeption) {
            myExeption.printStackTrace();
        }
    }
}

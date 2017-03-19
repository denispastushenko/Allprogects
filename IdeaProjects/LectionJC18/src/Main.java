
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread_());
        thread.start();
        System.out.println("Main");
    }
}

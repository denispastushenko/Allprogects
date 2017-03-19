import java.util.Arrays;

public class Main {
    //Overload. Перегрузка методов! Раннее связывание.Параметрический полиморфизмю.
    public static void main(String[] args) {
        test();
        test(10);
        test(10, 20);
        double result = test(12.1);
        test(12, 13, 14, 45, 78);
        System.out.println(result);
        aMethod((byte) 9);
        aMethod((short) 9);
        a1Method(11,12l);
        a1Method(10,11l);
    }
    public  static  void a1Method(int a,long a1){
        System.out.println("int,long");
    }

    public  static  void a1Method(long a,int a1){
        System.out.println("long,ing");

    }
 public  static  void aMethod(byte b){
        System.out.println("byte");

    }
    public  static  void aMethod(short b){
        System.out.println("short");

    }
    static void test() {
        System.out.println("No par");
    }

    static void test(int a) {
        System.out.println(a);
    }

    static void test(int a, int b) {
        System.out.println(a + " " + b);
    }

    static double test(double a) {
        System.out.println(a);
        return a * a;
    }

    static void test(int... a) {
        System.out.println(Arrays.toString(a));
    }
}

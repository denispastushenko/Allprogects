
public class RetObj {
    public static void main(String[] args) {
        Return ob1 = new Return(2);
        Return ob2;
        ob2 = ob1.IncrByTen();
        System.out.println("ob1: " + ob1.a);
        System.out.println("First increase: " + ob2.a);
        ob2 = ob2.IncrByTen();
        System.out.println("Second increase: " + ob2.a);
    }
}

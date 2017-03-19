
public class Equals {
    int a, b;

    Equals(int i, int j) {
        a = i;
        b = j;

    }

    boolean equals(Equals equals) {
        if (equals.a == a && equals.b == b) return true;
        else return false;

    }

    public static void main(String[] args) {
        Equals ob1 = new Equals(100, 22);
        Equals ob2 = new Equals(100, 22);
        Equals ob3 = new Equals(-1, -1);
        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.equals(ob3));
    }
}

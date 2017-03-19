
public class Test {
    int a;//default access
    public int b;
    private int c;

    void setC(int i) {//set c
        c = i;

    }

    int getc() {//get c
        return c;
    }
}

class AcssessTEst {
    public static void main(String[] args) {
        Test r = new Test();
        r.a = 10;
        r.b = 20;
        // r.c =10; Error
        r.setC(100);
        System.out.println(r.a + " " + r.b +  " " + r.getc());
    }


}
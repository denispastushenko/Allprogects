
public enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;


}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

    /*       ap = Apple.RedDel;
        System.out.println(ap);
        System.out.println();

        ap = Apple.GoldenDel;
        if(ap==Apple.GoldenDel){
            System.out.println("sf" + Apple.GoldenDel);
        }
        switch (ap){
            case Jonathan:
                System.out.println("Jon");
                break;*/
        ap = Apple.valueOf("GoldenDel");
        System.out.println("Object :" + ap);

        Apple allApples[] =Apple.values();
        for (Apple a: allApples) System.out.println(a);
        System.out.println();




    }
}


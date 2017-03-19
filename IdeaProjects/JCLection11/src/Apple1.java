
public enum Apple1 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;

    Apple1(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

class EnumDemo1 {
    public static void main(String[] args) {
Apple1 apl1;
        System.out.println(Apple1.Winesap.getPrice());
        System.out.println("All Prices");
        for (Apple1 a : Apple1.values())
            System.out.println(a.getPrice()+"-" + a.ordinal());
     /*   if(Apple.GoldenDel.compareTo(Apple1.Cortland)){}*/
    }


}

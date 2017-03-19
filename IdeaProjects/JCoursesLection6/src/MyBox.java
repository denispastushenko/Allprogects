
public class MyBox {
    public static void main(String[] args) {
        Box myBox = new Box(11, 15, 16);
        Box myBox1 = new Box(18.9, 17.8, 22);
        double vol, vol1;
        vol = myBox.volume();
        vol1 = myBox1.volume();
        System.out.println("Value1 = " + vol + ";");
        System.out.println("Value2 = " + vol1 + ";");
    }
}

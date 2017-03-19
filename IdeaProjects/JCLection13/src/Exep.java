public class Exep {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Этот текст никогда не будет напечатан." + a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
        System.out.println("Уже после блока try-catch.");
    }
}

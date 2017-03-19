
public class StringToEnum {
    private enum Currency{USD,AUD,GBP,EURO}

    public static void main(String[] args) {
        String usd = "USD";
        Enum currency = Enum.valueOf(Currency.class,usd);
        currency = Currency.valueOf(usd);
        System.out.println(currency);
       /* String INR = "INR";
        Currency ruppe = Currency.valueOf("INR");*/
    }
}

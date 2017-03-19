import java.lang.reflect.Field;

public class HomePage1 extends HomePage {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        HomePage b = new HomePage();
        Field iField = HomePage.class.getDeclaredField("i");
        iField.setAccessible(true);
        int fieldValue = iField.getInt(b);
        System.out.println("i = " + fieldValue);


    }
}

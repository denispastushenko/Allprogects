import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+(.+(com|ru|ua))");
        Matcher matcher = p.matcher("dpast-ush.enko199-6@gmail.ru");
        System.out.println(matcher.matches());
     // locale(Locale.CANADA);
    }
    private  static void locale(Locale locale){
        //Интернациолизация
        Locale locale12 =Locale.getDefault();
        System.out.println(locale12);
       Locale.setDefault(locale);
        System.out.println(locale);
    }
}

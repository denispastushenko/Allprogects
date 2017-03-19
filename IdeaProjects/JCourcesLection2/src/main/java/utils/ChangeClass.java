package utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeClass {
    public static   String replaceMethod(String s) {
        Pattern pattern = Pattern.compile("(.\\w[a-z]{1,})");
        Matcher matcher = pattern.matcher(s);
        matcher.find();
        return matcher.group();
    }
}

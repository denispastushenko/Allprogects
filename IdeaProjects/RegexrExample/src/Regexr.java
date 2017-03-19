/**
 * Created by Denys on 5/19/2016.
 */
//package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexr {
    public static void main(String[] args) {
        Pattern pt = Pattern.compile("(\\w+\\s(\\d+))");
        Matcher m = pt.matcher("June 2013");
        boolean ft = m.matches();
        System.out.println("ft = " + ft);

    }

}


public class Strings {

    public static void main(String[] args) {
        String s = "Demo Get Chars";
         int start =4;
         int end =10;
         char buf[] = new  char[end - start];
        s.getChars(start,end,buf,0);
        System.out.println(buf);
    }
}

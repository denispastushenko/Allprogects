import java.io.*;

import static java.lang.System.out;

public class Example1IO {
    private static final  String sourseFileName = "\\Z:\\sourse.txt";
    private static final  String destFileName = "\\Z:\\dest.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(sourseFileName));
        PrintWriter write = new PrintWriter(destFileName);
        String s;
        int words =0,lines =0 , chars=0;
        while ((s=reader.readLine())!=null) {
            lines++;
            String[] ws = s.trim().split("\\s");
            words += ws.length;
            for (String I : ws)
                chars += I.length();
            write.println(s.toUpperCase());
        }
        reader.close();
        write.close();
        out.printf("Скопировано символов - %d; слов-%d; строк-%d\n",chars,words,lines);
        }
    }


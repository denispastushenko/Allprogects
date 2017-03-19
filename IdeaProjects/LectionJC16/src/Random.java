import java.io.IOException;
import java.io.RandomAccessFile;

import static java.lang.System.out;

public class Random {//Доступ куда угодно в рамках файла!
    private static final  String sourseFileName = "\\Z:\\sourse.txt";

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(sourseFileName,"rw");
        out.println(raf.length());
        raf.seek(10);
        String s=raf.readLine();
        out.println(s);
        raf.seek(raf.length());
        raf.writeUTF("ѕривет");
        raf.close();
    }

}

import java.io.File;
import java.util.Date;
import static java.lang.System.out;

public class ExampleIO {
    private static final String FileName = ".\\test.txt";
    private static final String dirName = ".";

    public static void main(String[] args) {
        File f1 = new File(FileName);
        if (!f1.exists()) {
            out.printf("File %s does not exist", f1.getAbsolutePath());
        } else {
            out.println("________________Работа с файлом_____________");
            Date a = new Date(f1.lastModified());
            out.printf("File %s  Date: %s Size :%d\n", f1.getName(), a.toString(), f1.length());
        }
        File d1 = new File(dirName);
        if (!d1.exists()) {
            out.printf("Dir %s doesn't exist", d1.getAbsolutePath());
        } else {
            if (d1.isDirectory())
                out.println("___________________________Работа с папками________________");
            out.println(d1.getName());
            File[] files = d1.listFiles();
            assert files != null;
            for (File file : files) {
                if (file.isDirectory())
                    out.println(file.getName().toUpperCase());
                else
                    out.println(file.getName().toLowerCase());

            }
        }
    }
}


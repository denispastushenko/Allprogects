import java.io.*;

import static java.lang.System.out;

public class Example4 {
    public static void main(String[] args) throws IOException {
        FileInputStream st = new FileInputStream("\\Z:\\text.txt");

        out.print("\n___________Работа с Потоками читаем по байтам_____________\n");
        while (st.available() != 0)
        {
            int b = st.read();
            char ch = (char) b;
            out.print(ch);

        }
        st.close();
        FileOutputStream so = new FileOutputStream("\\Z:\\out.txt");
        String d = "Privet";
        byte[] bytes = d.getBytes();
        so.write(bytes);
        so.close();

        BufferedReader reader = new BufferedReader(new FileReader("\\Z:\\text.txt"));
        String s;

        out.print("\n___________Работа с BufferedReader читаем по строкам_____________\n");
        while ((s = reader.readLine()) != null) {
            out.println(s);
        }
        reader.close();

        PrintWriter write = new PrintWriter("out1.txt");
        write.printf("%s %d %c", "Stroka", 100, 'e');
        write.close();
    }

}


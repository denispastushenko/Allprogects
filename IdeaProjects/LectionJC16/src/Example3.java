import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Example3 {
    public static void main(String[] args) {
       try {
           FileWriter out = new FileWriter("\\Z:\\text.txt");
           BufferedWriter br = new BufferedWriter(out);
           PrintWriter pw = new PrintWriter(br);
           pw.println("I am a sentence in a text-file");
           pw.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}

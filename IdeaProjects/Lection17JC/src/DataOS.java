import java.io.*;

public class DataOS {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("Z:\\CoursesWorkSpace\\Test.dat"))) {
            dataOutputStream.writeDouble(98.6);
            dataOutputStream.writeInt(1000);
            dataOutputStream.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Output File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

        try (DataInputStream din =
                     new DataInputStream(new FileInputStream("Z:\\CoursesWorkSpace\\Test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();


            System.out.println("Here are the values: " +
                    d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Input File");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}

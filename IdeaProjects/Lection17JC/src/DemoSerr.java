import java.io.*;

public class DemoSerr {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student gonchar = new Student("MMF","Gonchar",1,"G017s9");
        System.out.println(gonchar);
        File fw =new File("Z:\\CoursesWorkSpace\\demo.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fw));
        objectOutputStream.writeObject(gonchar);
        objectOutputStream.close();
        Student.faculty = "GEO";
        File fr = new File("Z:\\CoursesWorkSpace\\demo.dat");
        ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
        Student unknown = (Student) istream.readObject();
        System.out.println(unknown);

    }
}

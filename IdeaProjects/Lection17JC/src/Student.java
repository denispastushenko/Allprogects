import java.io.Serializable;

public class Student implements Serializable {
    protected static  String faculty;
    private transient String password;
    private  String name;
    private int id;

    private  static final long serialVersionUID =1L;

    @Override
    public String toString() {
        return "\nfaculty"+ faculty+"Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }

    public Student(String nameOfFaculty,String name, int id, String password) {
        faculty = nameOfFaculty;
        this.name = name;
        this.id = id;
        this.password = password;
    }
}

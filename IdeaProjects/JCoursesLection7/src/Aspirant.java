
public class Aspirant extends Student {
    String workName;

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public Aspirant(String name, int age) {
        super(name, age);
        this.workName=workName;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "workName='" + workName + '\'' +
                '}';
    }

    public Aspirant(String workName) {

        this.workName= workName;
    }
}

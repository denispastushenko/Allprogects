
public class Box {
    double width;
    double height;
    double dept;

    double volume() {
        return width * height * dept;
    }

    Box(double w, double d, double h) {
        width = w;
        height = h;
        dept = d;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Good luck Box");
    }
}

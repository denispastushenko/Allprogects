
public class ExampleMaxMin implements Comparable {

int a;

    public ExampleMaxMin(int a) {
        this.a = a;
    }

    @Override
    public int compareTo( Object o) {
        return this.a-((ExampleMaxMin)o).a;

    }
}

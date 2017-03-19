package objmethods;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        final  int [] a={1,2,3,4,5};
        a[2]=100;
        System.out.println(Arrays.toString(a));
        System.out.println(Point.get());

        Point point = new Point(10, 20);

        Point point1 = (Point) point.clone();

        System.out.println(point.hashCode());
        System.out.println(point1.hashCode());
        System.out.println(point );
        System.out.println(Point.class==point.getClass());
        System.out.println(point.count);
        Point point2 = new Point1(100,100);
        System.out.println(point2);
        System.out.println(Point1.count);
        Point1.count=Point1.count+100;
        System.out.println(Point1.count);
        System.out.println(Point.count);
        System.out.println(point.count=point1.count+1000);
        System.out.println(point.count);
    }


}

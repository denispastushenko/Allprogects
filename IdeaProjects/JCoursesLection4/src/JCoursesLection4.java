import static example.Invertation.invert;

public class JCoursesLection4 {
    public static void main(String[] args) {
       /* int i = 0;
        while (i < 100) {
            if (i == 10) {break;}
            i++;
            System.out.println("i:" + i);
        }
        System.out.println("Complete");*/

/*        String s1, s2;
        s1 = "Java";
        s2 = s1;
        s1 += '2';
        s2 = new String(s1);
        System.out.println(s1 + " " + s2);
        System.out.println("Links" + " " + (s1 == s2));
        System.out.println("Values" + " " + s1.equals(s2));*/
         /*String intS ="123",dobS="123.45";
        int x;double y;
        x =Integer.parseInt(intS);
        y =Double.parseDouble(dobS);
        System.out.println(x);
        System.out.println(y);
        intS = String.valueOf(x+1);
        dobS = String.valueOf(y+1);
        System.out.println(intS);
        System.out.println(dobS);
        String s;
        s ="num"+345;
        System.out.println(s);*/

        /*System.out.println(Integer.toString(123));
        System.out.println(Integer.toBinaryString(123));
        System.out.println(Integer.toHexString(123));
        System.out.println(Integer.toOctalString(123));*/

      /*  System.out.println(Arrays.toString(args));*/

      /*  int[]arr1D={0,1,2,3};
        int[][]ar2D={{0,1},{2,3}};
        System.out.println(arr1D);
        System.out.println(Arrays.toString(arr1D));
        System.out.println(ar2D);
        System.out.println(Arrays.toString(ar2D));
        System.out.println(Arrays.deepToString(ar2D));*/


        int[]arr={1,2,3,4,5,6,7};
       invert(arr);
    }
   
}

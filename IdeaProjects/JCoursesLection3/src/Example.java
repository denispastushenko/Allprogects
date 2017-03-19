import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        //System.out.println("4/2="+4/2 =="4/2=2");

      /*  String a = "Hi";//Ссылка на объект.
        String b = new String("Hi");//Новый участок памяти-новый обыект!
        System.out.println(a==b);
        System.out.println(a.equals(b));*/

/*
        byte b1 = 50, b2 = -99;
        short s = (short) (b1 + b2);
        System.out.println(s);
        int a = Integer.MAX_VALUE;
        System.out.println(a + " " + (a + 1));*/



/*
        int age = scanner.nextInt();
        if (age >= 3 && age <= 6) {
            answer = "Baby House";
            System.out.println(answer);
        } else if (age > 6 && age <= 17) {
            answer = "School";
            System.out.println(answer);
        } else if (age > 17 && age <= 22) {
            answer = "Height School";
            System.out.println(answer);
        } else if (age > 22 && age <= 60) {
            answer = "Work";
            System.out.println(answer);
        } else if (age > 60 && age <= 90) {
            answer = "Work";
            System.out.println(answer);
        } else System.out.println("Rest");
    */
 /*       String answer = "";
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                answer = "Week Day";
                break;
            case 6:
            case 7:
                answer = "Day Off";
                break;

        }
        System.out.println(answer);
    */
       /* int n = 10;
        while (n>0){
            System.out.println("tick " + n);
            n--;
        }*/
       /* int i = 100;
        int j = 200;
        while (i++<--j);
            System.out.println("Midpoint = " + i);*/

       /* int n = 10;
        do {
            System.out.println("tick " + n);
            n--;
        }while (n>0);*/
        /*for (int n = 10;n>0;n--){
            System.out.println("Result: " + n);
        }*/
        /*int[] ints = {1, 2, 3, 4};
        int sum = 0;
        for (int x : ints
                ) {
            System.out.println("Value :" + x);
            sum += x;

        }
        System.out.println(sum);*/

       /* int y = 0;

        int[][] arr = new int[3][5];
       for(int i = 0 ;i<3;i++)
        for(int j = 0 ;j<5;j++)
            arr[i][j]=(i+1)*(j+1);

        for (int[] x : arr
                ) {
            int sum = 0;
            for (int y1 : x) {
                System.out.println("Value" + y1);
                y += y1;
                sum += y1;

            }
            System.out.println("Result " + y);
            System.out.println("Sum row" +sum );
            System.out.println(Arrays.deepToString(arr));

        }*/
        Integer w =4;
        int we =6;
        long f =5;
        double t =0;
        byte ty =5;
        short m =90;
        List<Number> numberList = new ArrayList<>();
        numberList.add(w);
        numberList.add(we);
        numberList.add(f);
        numberList.add(t);
        numberList.add(ty);
        numberList.add(m);

        System.out.println(numberList);

    }

}



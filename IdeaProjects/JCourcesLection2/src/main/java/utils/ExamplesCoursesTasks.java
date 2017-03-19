package utils;

public class ExamplesCoursesTasks {

    public static void main(String[] args) {

//Считка с консоли одного символа.
       /* int inputRead = System.in.read();
        System.out.printf("(char)inputRead  = " + (char) inputRead + ";");*/

//Считка с консоли с помощью "Scanner" .
       /* Scanner scanner = new Scanner(System.in);
        String nameOfOurString = scanner.nextLine();
        System.out.println("Result = " + nameOfOurString +";");
        scanner.close();*/

//Деление внутри системного вывода.
     /*   int firstVariable = 7;
        int secondVariable = 2;
        System.out.println(firstVariable/secondVariable);*/

// Сравнение ++i/i++;
       /* int firstVariable = 7;
         System.out.println(firstVariable++);
        System.out.println(++firstVariable);*/

//Приведение чилел к типу "float".
        /*float floatExample = 0.1f;
        String newLine = System.getProperty("line.separator");
        System.out.println(floatExample + newLine + (3.0f + 4.0f));*/

//Приведение чилел к типу "float".
       /* float x =0,y= 0;
        x =(float)(0.3+0.4);
         y = (0.3f+0.4f);
        System.out.println(x==y);*/

//Деление на 0 = безконечность.
      /*  System.out.println(2/0.0);
        System.out.println(2.0/0);*/

//Умножение безконечности = не число.
       /* double infinity = Double.NEGATIVE_INFINITY;
        System.out.println(infinity * 0); //NaN- not a Number!!*/

//Операции с "char" с ипользованьем кода ASCII для "char".
       /* char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1+c2+c3);*/

//Операции с "char" с ипользованьем кода ASCII для "char".
       /*  char ch1,ch2;
        ch1 =88;
        ch2 ='Y';
        System.out.print("ch1 and ch2 + ");
        System.out.println(ch1 + "" + ch2);*/

//Дз - вывести алфавит с ипользованьем кода ASCII для "char".
      /*  char ch1=97,ch2=122;
        while (ch1<=ch2){
            System.out.print(" " + ch1++);
        }*/

//Второй вариант!
      /*  char ch1 = 97, ch2 = 122;
        for (;ch1<=ch2;) {System.out.print(" " + ch1++);
        }*/

//Пощитать процент от деления не используя знака "%".
       /* int firstDigit = 725;
        int secondDigit =75;
        int incompletePrivate = firstDigit / secondDigit;
        int rest = firstDigit - (secondDigit * incompletePrivate);
        System.out.println(rest);*/

//"Java against C++" на входе строка(переменная пример записи "Java") на выходе строка(переменная пример записи "C++").
     /*   StringBuffer line = new StringBuffer("javaStringExampleChange");
        String newLine = System.getProperty("line.separator");
        System.out.println("Java String: variable a = " + line + " ;" + newLine);
String s ="";

        for (int i = 0; i<line.length();i++) {
            char c =line.charAt(i);
            //String result = ChangeClass.replaceMethod(Character.toString(c));
            s+= Character.toString(c);




        }
        String result = ChangeClass.replaceMethod(s);
        System.out.println("C++ String: variable a = " + result + " ;");
*/


 /*line.insert(6, "_");
        line.insert(11, "_");
        line.insert(19, "_");*/

       /* String string = "";
        StringBuffer stringBuffer = null;
        Pattern pattern = Pattern.compile("([A-Z])");
        // System.out.println(ChangeClass.replaceMethod(string).toLowerCase());
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            string += Character.toString(c);
            if (pattern.matches("([A-Z])", Character.toString(c) )) {
                stringBuffer = new StringBuffer(string);
                stringBuffer.insert(i, "_");
            }
        }
        System.out.println(string.toLowerCase());
        System.out.println(stringBuffer.toString().toLowerCase());*/



    }
}


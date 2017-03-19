


    import static java.lang.System.out;

    public class Test
    {
        public String testfield="(testfield!)";
        public static class Mynested/*nested class
 вложенный класс независим от внешнего (без объекта внешнего класса)*/
        {
            public String nested="(nested!)";
            public void nestedshow(){
                out.println("Привет я вложеный класс !"+nested);}
        }
        public  class Myinner/*inner class
вложенный класс зависим от внешнего (необходим объекта внешнего класса)*/
        {
            public String inner="(inner!)";
            public void innershow()	{
                out.println("Привет я вложеный класс !"+inner);}
        }
        public void show() {
            System.out.println("Привет я просто класс!"+testfield);}
    }



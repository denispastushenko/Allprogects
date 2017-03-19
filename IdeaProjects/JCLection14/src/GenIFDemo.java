
class GenIFDemo {
    public static void main(String args[]) {
        Integer inums[] = {3, 6, 2, 8, 6 };
        Character chs[] = {'b', 'r', 'p', 'w' };
        ExampleMaxMin as [] ={new ExampleMaxMin(13),new ExampleMaxMin(23),new ExampleMaxMin(90)};

        MyClass <ExampleMaxMin> iob = new MyClass <ExampleMaxMin> (as);
        MyClass <Character>  cob = new MyClass <Character> (chs);
        MyClass <Integer>  cob1 = new MyClass <Integer> (inums);

        System.out.println("Max value in inums: " + cob1.max());
        System.out.println("Min value in inums: " + cob1.min());

        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());
    }
}

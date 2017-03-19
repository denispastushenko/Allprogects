class TwoGen<T,V> {
    T ob;
    V ob1;

    public TwoGen(T ob, V ob1) {
        this.ob = ob;
        this.ob1 = ob1;
    }

    T getob() {
        return ob;
    }

    V getOb1() {
        return ob1;
    }

    void showType() {
        System.out.println("Type of T is " +
                ob.getClass().getName());
        System.out.println("Type of T is " +
                ob1.getClass().getName());
    }
}


class GenDemo {
    public static void main(String args[]) {
        TwoGen <Integer, String> tgObj =
                new TwoGen <Integer, String> (88, "Generics");

        // Show the types.
        tgObj.showType();

        // Obtain and show values.
        int v = tgObj.getob();
        System.out.println("value: " + v);

        String str = tgObj.getOb1();
        System.out.println("value: " + str);
    }

}


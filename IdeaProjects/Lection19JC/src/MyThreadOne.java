
class MyThreadOne extends Thread {
    private Thread t2;

    MyThreadOne() {
        System.out.println("MyThreadOne create");

    }

    public void run() {
        System.out.println("MyThreadOne start");
        try {
            sleep(1000);
        } catch (Exception ignored) {
        }
        try {
            System.out.println("MyThreadOne waiting MyThreadTwo finish…");
            t2.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadOne finished");
    }

    void setThread2(Thread t) {
        this.t2 = t;
    }
}

class TestMain {
    public static void main(String[] args) {
        MyThreadOne t1 = new MyThreadOne();
        MyThreadTwo t2 = new MyThreadTwo();

        t1.setThread2(t2);
        t2.setThread1(t1);
        t1.start();
        t2.start();
    }
}

class MyThreadTwo extends Thread {
    private Thread t1;

    MyThreadTwo() {
        System.out.println("MyThreadTwo create");
    }

    public void run() {
        System.out.println("MyThreadTwo start");
        try {
            System.out.println("MyThreadTwo waiting MyThreadOne finish…");
            t1.join();

        } catch (Exception ignored) {
        }
        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadTwo finished");
    }

    void setThread1(Thread t) {
        this.t1 = t;
    }
}

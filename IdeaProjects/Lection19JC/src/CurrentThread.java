
public class CurrentThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current thread: " + thread);
        thread.setName("My Thread");
        System.out.println("After change: " + thread);

        new Thread(){
            public void run(){
                System.out.println("Start");
                Thread.yield();//освобождает место
                System.out.println("Finish");
            }
        }.start();
        new Thread(){
            public void run(){
                System.out.println("Start");
                System.out.println("Finish");
            }
        }.start();

        for (int n = 5 ;n>0;n--){

            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted!");
                e.printStackTrace();
            }
        }
    }
}

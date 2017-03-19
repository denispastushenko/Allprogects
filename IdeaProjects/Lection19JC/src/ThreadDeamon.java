
public class ThreadDeamon extends  Thread {
    public  void run(){
        try{
            if(isDaemon()) {
                System.out.println("старт потока-демона");
                Thread.sleep(1);
            } else {
                System.out.println("старт обычного потока");
            }
        } catch(InterruptedException e) {
            System.err.print(e);
        } finally{
            if(!isDaemon()) {
                System.out.println("завершение обычного потока");
            } else {
                System.out.println("завершение потока-демона");
            }}}}

class DeamonRunner{
    public static void main(String[] args) {
        ThreadDeamon usual = new ThreadDeamon();
        ThreadDeamon deamon = new ThreadDeamon();
        deamon.setDaemon(true);
        deamon.start();
        usual.start();
        System.out.println("Last Main");
    }
}


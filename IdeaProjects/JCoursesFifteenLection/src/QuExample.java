import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class QuExample {
    public static void main(String[] args) {
        Queue<String> queue =new LinkedList<>();
        PriorityQueue<String> queue1 =new PriorityQueue<String>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");
        while (queue.size() > 0)
            System.out.print(queue.remove() + " ");
            System.out.print("--"+queue1.remove() + " ");
    }

}


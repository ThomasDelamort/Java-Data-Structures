import java.util.LinkedList;
import java.util.Queue;

public class queue {
    // A queue is a FIFO data structure
    // First come first serve
    static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        queue.offer("Hana");
        queue.offer("Fione");
        queue.offer("Madame");
        queue.offer("Nicky");

        System.out.println(queue);
    }
}

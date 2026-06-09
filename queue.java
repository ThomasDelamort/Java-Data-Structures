import java.util.LinkedList;
import java.util.Queue;

public class queue {
    // A queue is a FIFO data structure
    // First come first serve
    static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        queue.offer("Neal");
        queue.offer("Devann");
        queue.offer("Aeirol");
        queue.offer("Anton");

        System.out.println(queue);
    }
}

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Quene2 {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(7);
        priorityQueue.add(6);
        priorityQueue.add(4);
//        priorityQueue.add(1);
        Integer peek = priorityQueue.peek();
        System.out.println();
        priorityQueue.remove();
        priorityQueue.element();
        System.out.println(priorityQueue);
    }
}

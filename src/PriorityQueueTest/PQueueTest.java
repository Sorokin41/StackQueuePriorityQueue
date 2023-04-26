package PriorityQueueTest;

public class PQueueTest {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(4);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        System.out.print(queue.remove() + " ");
        System.out.print(queue.remove() + " ");
        System.out.print(queue.remove() + " ");
        System.out.print(queue.remove() + " ");


    }
}

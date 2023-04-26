package PriorityQueueTest;

public class PriorityQueue {
    private int maxSize;
    private long[] queue;

    private int nItems;

    public PriorityQueue(int x) {
        maxSize = x;
        queue = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item){
        int i;
        if (nItems == 0){
            queue[nItems++] = item;
        } else {
            for (i = nItems - 1; i >= 0; i--) {
                if (item > queue[i])
                    queue[i + 1] = queue[i];
                else
                    break;
            }
            queue[i + 1] = item;
            nItems++;
        }
    }

    public long remove(){
        return queue[--nItems];
    }

    public long peekMin(){
        return queue[nItems-1];
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }
}

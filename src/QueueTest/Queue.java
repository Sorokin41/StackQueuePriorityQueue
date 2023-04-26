package QueueTest;

public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int nItems;
    private int front;
    private int rear;

    public Queue(int x){
        maxSize = x;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long item){
        if (rear == maxSize){
            rear = -1;
            queueArray[++rear] = item;
        }
        nItems++;
    }

    public long remove(){
        long temp = queueArray[front++];
        if (front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }
}

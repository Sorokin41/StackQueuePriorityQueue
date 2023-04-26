package StackTest;

public class StackX {
    private int maxSize;
    private long[] stack;
    private int top;

    public StackX(int maxSize){
        this.maxSize = maxSize;
        stack = new long[maxSize];
        top = -1;
    }

    public void push(long x){
        stack[++top] = x;
    }

    public long pop(){
        return stack[top--];
    }

    public long peek(){
        return stack[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public void printStack(){
        for (int i = 0; i < maxSize; i++ ){
            System.out.print("[" + stack[i] + "] ");
        }
    }
}

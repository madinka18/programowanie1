package pl.sdacademy.structure;

public class Queue <T> {

    private final static int SIZE = 5;
    private Object[] stack1;
    private int top1;

    public Queue() {
        stack1 = new Object[SIZE];
        top1 = -1;

    }


    public void push(T element) {

        if (top1 >= stack1.length-1) {
            extendQueue();
        }
        stack1[++top1] = element;
    }

    private void extendQueue() {
        Object[] newStack1 = new Object[stack1.length + SIZE];
        for (int i = 0; i < stack1.length ; i++) {
            newStack1[i] = stack1[i];
        }
        stack1 = newStack1;
    }

    public T pop() {
        Object element = stack1[0];
        for (int i = 0; i < top1; i++) {
            stack1[i] = stack1[i + 1];
        }

        stack1[top1] = null;


        return (T) element;
    }

    public int size() {
        return 0;
    }

    public T peek() {
        return (T) stack1[top1];
    }

    public void print() {
        for (int i = top1; i >= 0; i--)
            System.out.println(stack1[i]);

    }
}
package pl.sdacademy.structure;

public class QueueTest {
    public static void main(String[] args) {
        Queue <Integer> queue = new Queue<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        queue.print();
        System.out.println( " Zdejmuje: " + queue.pop());
        queue.print();
    }



}

package queue;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue(10);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println(q);
        System.out.println(q.dequeue());
        System.out.println(q);
        System.out.println(q.peek());
    }
}

package curcular_queue;

public class Main {
    public static void main(String[] args) {

        CQ cq = new CQ(10);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);

        System.out.println(cq);
        cq.dequeue();
        cq.dequeue();
        System.out.println(cq);
        System.out.println(cq.peek());
    }
}

package linked_list;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.traverse();

        list.insertAtFront(100);
        list.insertAtFront(200);
        list.insertAtFront(300);
        list.traverse();

        list.insertAtPosition(100,2);
        list.traverse();

        System.out.println("Search 20 : "+list.search(20));
        System.out.println("Search 1000 : "+list.search(1000));

        list.deleteAtValue(20);
        list.traverse();
        list.deleteAtPosition(4);
        list.traverse();

        System.out.println("Reversing the list");
        list.reverse();

        list.traverse();

    }
}

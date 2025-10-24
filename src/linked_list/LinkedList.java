package linked_list;

public class LinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node head;

    // insertion at the end
    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    // insertion at the beginning
    public void insertAtFront(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    // insertion to a specific position
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position==0){
            insertAtFront(data);
            return;
        }

        Node current = head;
        for(int i=0; current !=null && i < position-1  ;i++){
            current=current.next;
        }

        if(current == null){
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // deletion by value
    public void deleteAtValue(int value){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        if(head.data == value){
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        while(current !=null && current.data != value){
            previous = current;
            current = current.next;
        }

        if(current == null){
            System.out.println("Value not found");
            return;
        }

        previous.next = current.next;
    }

    // deletion by position
    public void deleteAtPosition(int position){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(position==0){
            head = head.next;
            return;
        }

        Node current = head;
        for(int i=0; current !=null && i < position-1; i++){
            current=current.next;
        }

        if(current == null || current.next == null){
            System.out.println("Position out of bounds");
            return;
        }

        current.next = current.next.next;
    }

    // Traversal
    public void traverse(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.print("[ ");

        while(current !=null){
            System.out.print(current.data+" | ");
            current = current.next;
        }
        System.out.println("]");
    }

    // search
    public boolean search(int value){
        Node current = head;

        while(current !=null){
            if(current.data == value){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    // reverse linked list
    public void reverse(){
        Node previous = null;
        Node current = head;
        Node next = null;

        while(current !=null){
            next = current.next; // store next node
            current.next = previous; // reverse link creation
            previous = current; // move previous one step
            current = next; // move current one step
        }

        head = previous; // new head
    }
}

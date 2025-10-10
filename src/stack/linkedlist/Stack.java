package stack.linkedlist;

import java.util.EmptyStackException;

public class Stack {

    private Node top;
    private int size;

    public Stack() {
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = this.top;
        this.top = newNode;
        size++;
    }

    public int pop(){
        if(top != null){
            Node temp = top;
            top = top.next;

            int value = temp.data;
            temp = null;
            size--;

            return value;
        }else{
            return -1;
        }
    }

    public int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Stack (top -> bottom): ");

        Node current = top;
        while(current != null){
            sb.append(current.data);
            if(current.next != null){
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}

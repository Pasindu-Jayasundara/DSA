package stack.queue;

public class Queue {

    private int[] arr;
    private int front, rear, capacity, size;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size =0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int value){
        if(!isFull()){
            arr[++rear] = value;
            size++;
        }else{
            System.out.println("Queue is full");
        }
    }

    public int dequeue(){
        if(!isEmpty()){
            int value = arr[front++];
            size--;
            return value;
        }else{
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public int peek(){
        if(!isEmpty()){
            return arr[front];
        }else{
            System.out.println("Queue is empty");
            return -1;
        }
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return "Queue is empty";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Queue (front -> rear): ");
        for(int i = front; i <= rear; i++){
            sb.append(arr[i]);
            if(i < rear) sb.append(" -> ");
        }

        return sb.toString();
    }
}

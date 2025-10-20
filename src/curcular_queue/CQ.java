package curcular_queue;

public class CQ {
    private int arr[];
    private int front, rear, size, capacity;

    public CQ(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int value){
        if(!isFull()){
            if(front == -1){
                front = 0;
            }
            rear =  (rear + 1) % capacity;
            arr[rear] = value;
            size++;
        }else{
            System.out.println("Queue is full");
        }
    }

    public int dequeue(){
        if(!isEmpty()){
            int value = arr[front];
            front = (front + 1) % capacity;
            size--;

            if(size == 0){
                front = -1;
                rear = -1;
            }
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
            return "Circular Queue is empty";
        }

        StringBuilder sb = new StringBuilder("CQ: [");
        for(int i =0; i<size;i++){
            sb.append(arr[(front +i)%capacity]);
            if(i<size-1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

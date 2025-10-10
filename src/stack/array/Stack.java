package stack.array;

import java.util.EmptyStackException;

public class Stack {

    private int[] data;
    private int capacity, size, top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int value){
        if(!isFull()){
            data[++top] = value;
            size++;
        }else{
            throw new StackOverflowError("Stack is full");
        }
    }

    public int pop(){
        if(!isEmpty()){
            size--;
            return data[top--];
        }else{
            throw new EmptyStackException();
        }
    }

    public int peek(){
        if(!isEmpty()){
            return data[top];
        }else{
            throw new EmptyStackException();
        }
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
        String out = "[";
        for(int i = 0; i < size; i++){
            out += data[i];
            if(i == size - 1){
                out += "]";
            }else{
                out += ",";
            }
        }
        return out;
    }
}

package array;

public class Array {

    private int[] data;
    private int size; //  now size
    private int capacity; // maximum

    public Array(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
    }

    //add
    public void add(int value){
        if(size < capacity){
            data[size++] = value;
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    //add by index
    public void add(int index, int value){
        if(index >= 0 && index <= size && size < capacity){
            for(int i = size; i > index; i--){
                data[i] = data[i - 1];
            }
            data[index] = value;
            size++;
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    //find
    public int find(int value){
        for(int i = 0; i < size; i++){
            if(data[i] == value){
                return i;
            }
        }
        return -1;
    }

    //delete
    public void remove(int value){
        int index = find(value);
        if(index == -1){
            throw new ArrayIndexOutOfBoundsException();
        }

        for(int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }
        data[--size] = 0;
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

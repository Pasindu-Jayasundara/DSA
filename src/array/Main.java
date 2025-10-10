package array;

public class Main {

    public static void main(String[] args) {

        Array ar = new Array(10);
        ar.add(10);
        ar.add(20);
        ar.add(30);
        System.out.println(ar);

        ar.add(1,100);
        System.out.println(ar);

        int index = ar.find(20);
        System.out.println(index);

        ar.remove(100);
        System.out.println(ar);
    }
}

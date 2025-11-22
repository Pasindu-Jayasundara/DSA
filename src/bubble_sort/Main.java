package bubble_sort;

public class Main {
    public static void main(String[] args) {

        int[] array = {3,4,6,1,3,8,7,2,3};
        BubbleSort bs = new BubbleSort();

        System.out.println("Before sorting: ");
        bs.printArray(array);

        bs.bubbleSort(array);

        System.out.println("\nAfter sorting: ");
        bs.printArray(array);
    }
}

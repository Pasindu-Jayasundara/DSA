package insertion_sort;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {3,4,5,6,2,8};
        InsertionSort is = new  InsertionSort();

        System.out.println("Before sorting: ");
        is.printArray(numbers);

        is.insertionSort(numbers);

        System.out.println("After sorting: ");
        is.printArray(numbers);
    }
}

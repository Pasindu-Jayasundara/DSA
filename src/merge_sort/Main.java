package merge_sort;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {23,45,67,87,43,11,1,23,45};
        MergeSort ms = new MergeSort();

        System.out.println("Before sorting: ");
        ms.printArray(numbers);

        ms.mergeSort(numbers, 0, numbers.length-1);

        System.out.println("\nAfter sorting: ");
        ms.printArray(numbers);
    }
}

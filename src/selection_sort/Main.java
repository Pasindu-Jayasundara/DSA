package selection_sort;

public class Main {
    public static void main(String[] args) {

        int[]array = {3,4,6,1,3,8,7,2,3};
        SelectionSort ss = new SelectionSort();

        System.out.println("Before sorting: ");
        ss.printArray(array);

        ss.selectionSort(array);

        System.out.println("\nAfter sorting: ");
        ss.printArray(array);
    }
}

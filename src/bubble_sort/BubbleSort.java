package bubble_sort;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        int length = arr.length;
        boolean swapped;

        for(int i = 0; i < length - 1 - i; i++) {
            swapped = false;

            for(int j = 0; j < length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = false;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }

    public void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}

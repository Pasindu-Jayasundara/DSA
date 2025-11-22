package merge_sort;

public class MergeSort {

    // recursive merge sort
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right)/2;

            // sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // merge the sorted halves
            merge(arr,left,mid,right);
        }
    }

    // merge two halves
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data to temp arrays
        for(int i = 0; i < n1; i++){
            L[i] = arr[left+i];
        }
        for(int j = 0; j < n2; j++){
            R[j] = arr[mid+1+j];
        }

        // merge temp arrays
        int i = 0, j=0;
        int k = left;

        while(i < n1 && j < n2){

            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of L[]
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        // copy remaining elements of R[]
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // utility function to print array
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}

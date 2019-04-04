package prep;


public class SortingStuff {

    static void quickSort(int arr[], int min, int max) {
        if (min < max)
        {
            int pi = partition(arr, min, max);
            quickSort(arr, min, pi-1);
            quickSort(arr, pi+1, max);
        }
    }

    static int partition(int arr[], int min, int max){
        int pivot = arr[max];
        int i = min - 1;

        for(int j = min; j < max; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[max];
        arr[max] = temp;

        return i+1;
    }

    static void mergeSort(){

    }
}
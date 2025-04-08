public class QuickSort {
    //method to display array
    public static void printArr (int arr []) {
        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //method for quickSort
    public static void quickSort(int arr[], int si, int ei) {
        //Base Case:
        if (si >= ei) {
            return;
        }
        //Initially pivot is the last element. 
        int pIdx = partition(arr, si, ei) ; //Returns index of pivot element after sorting
        quickSort(arr, si, pIdx-1); //left part
        quickSort(arr, pIdx+1, ei); //right part
    }

    //method for partition sorting.
    public static int partition (int arr[], int si, int ei) {
        int pivot = arr[ei] ; 
        int i = si-1 ;      //to make place for elements smaller tha pivot.
        for (int j=si ; j<ei ;j++){
            if (arr[j] <= pivot) {
                i++ ;
                //swap
                int temp = arr[j] ; 
                arr[j] = arr[i] ; 
                arr[i] = temp ;
            }
        }
        i++ ; 
        int temp = pivot ;
        arr[ei] = arr[i] ; //Dont't write pivot = arr[i] as this will change value in variable not array
        arr[i] = temp ;
        return i ;
    }
    //main method
    public static void main(String[] args) {
        int arr [] = {6,3,9,2,8,5} ;
        quickSort(arr, 0, arr.length-1) ;
        printArr(arr) ;
    }
}

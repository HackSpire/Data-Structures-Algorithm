public class SortedArray {
    //method to check if array is sorted in ascending order or not.
    public static boolean isSorted (int arr[], int i) {
        if (i == arr.length - 1) {      // i=arr.length-1 then it traversed till end and isSorted means arrived it's Base Case 
            return true ; 
        }
        if (arr[i] > arr[i+1]) {        //means not sorted in ascending order.
            return false;
        }
        return isSorted(arr,i+1) ;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5} ; 
        System.out.println(isSorted(arr, 0));
    }
}

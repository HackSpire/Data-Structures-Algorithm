public class FirstOccurence {
    //function to get first occurence of an element in an array.
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1 ;
        }
        if (arr[i] == key) {
            return i ; 
        }
        return firstOccurence(arr, key, i+1) ; 
    }
    public static void main(String[] args) {
        int arr [] = {8,3,6,9,5,10,2,5,3};
        int index = firstOccurence(arr, 5, 0) ;
        if (index == -1) {
            System.out.println("Key not found!!!");
        }
        else{
            System.out.println("Key found at index: " + index);
        }
    }
}

public class Sorting_SelectionSort {
    
    public static void SelectionSort(int arr[]){
        //Example- 5,4,1,3,2
        for(int i=0; i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[minPos]){
                    minPos=j;
                }
                //swap
                int temp = arr[minPos];
                arr[minPos]=arr[j];
                arr[j]=temp;
            }
        }
        DisplayArr(arr);
    }
    
    public static void DisplayArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        SelectionSort(arr);
    }
}

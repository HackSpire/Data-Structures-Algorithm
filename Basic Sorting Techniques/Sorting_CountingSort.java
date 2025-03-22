public class Sorting_CountingSort {
    public static void CountingSort(int arr[]){
        //Example- [1,4,1,3,2,4,3,7]
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);         //largest=7
        }

        int count[] = new int[largest+1];
        for(int i=0;i<count.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
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
        int arr[] = {1,4,1,3,2,4,3,7};
        CountingSort(arr);
    }
}

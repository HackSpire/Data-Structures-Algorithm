public class SpiralMatrix {

    public static void PrintSpiral( int arr[][] ) {
        int row_start = 0 ; 
        int row_end = arr.length - 1 ; 
        int col_start = 0 ;
        int col_end = arr[0].length - 1 ;  //2D Array's column length -> arr[0].length

        while(row_start <= row_end && col_start <=col_end) {
            //Print top elements .
            for (int col = col_start ; col<=col_end ; col++) {
                System.out.print(arr [row_start][col] + " ");
            }

            //Print right elements.
            for (int row = row_start+1 ; row<=row_end ; row++) {
                System.out.print(arr [row][col_end] + " ");
            }

            //Print bottom elements.
            for (int col = col_end-1 ; col>=col_start ; col--) {
                if(col_start == col_end) {
                    break;
                }
                System.out.print(arr [row_end][col] + " " );
            }

            //Print left elements.
            for (int row = row_end - 1 ; row>=row_start ; row--) {
                if (row_start == row_end) {
                    break;
                }
                System.out.print(arr [row][col_start] + " " );
            }

            row_start ++ ; 
            row_end -- ; 
            col_start ++ ; 
            col_end -- ; 
        }
    }
    
    public static void main (String args[]) {  
        int arr [][] = { {2,5,6,7,1} , {1,2,6,9,4} , {7,7,2,0,0,5} , {2,6,0,7,1} , {2,4,0,7,5} } ;
        PrintSpiral(arr);
    }
}
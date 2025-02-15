public class SearchInSortedMatrix {

    public static boolean Staircase_Search (int matrix[][] , int key) {
        //starting from cell (0,m-1) . //Top Rightmost cell
        int row = 0 , col = matrix[0].length - 1 ; 
        
        while ( row <= matrix.length - 1 && col >=0 ) {
            if (key == matrix[row][col]) {
                System.out.println("Key found at (" + row + "," + col + ")" );
                return true ;
            }
            else if (key < matrix[row][col]) {
                //Move left side.
                col -- ;
            }
            else {
                //Move towards bottom side.
                row ++ ; 
            }
        }
        System.out.println("Key not found.");
        return false ; 
    }
    public static void main (String args[]) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        // 10 20 30 40
        // 15 25 35 45
        // 27 29 37 48
        // 32 33 39 50
        int key = 33 ; 
        Staircase_Search (matrix,key) ; 
    }
}

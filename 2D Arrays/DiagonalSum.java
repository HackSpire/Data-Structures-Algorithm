public class DiagonalSum {

    /*

    public static int Diagonal_Sum (int matrix[][]) {      // Unoptimized Code -> O(n^2)
        int sum = 0;
        for(int i=0 ; i<matrix.length ; i++) {              //O(n)
            for(int j=0 ; j<matrix[0].length ; j++) {       //O(n)
                //Primary Diagonal -> (i==j)
                if ( i==j ) {
                    sum += matrix[i][j] ; 
                }
                //Secondary Diagonal -> (i+j == n-1)
                else if (i+j==matrix.length-1) {
                    sum += matrix[i][j] ; 
                }
            }
        }
        return sum;
    }

    */

    //Optimized Code -> O(n)
    
    public static int Diagonal_Sum (int matrix[][]) {
        int sum = 0 ;
        for (int i=0 ; i<matrix.length ; i++) {             //O(n)
            //Primary Diagonal Sum -> (i==j)
            sum += matrix[i][i] ; 
            //Secondary Diagonal Sum -> (i+j == n-1) --> [ j = n-1-i ]
            if (i != matrix.length - 1- i ) {       // if( i != j )
                sum += matrix[i][matrix.length-1-i] ; 
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}} ; // n=m (rows=cols)
        System.out.println("Diagonal Sum is : " + Diagonal_Sum(matrix));
    }
}

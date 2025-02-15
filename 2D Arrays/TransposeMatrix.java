import java.util.*;
public class TransposeMatrix {
    public static void DisplayMatrix (int matrix[][]) {
        for(int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Transpose_Matrix(int Transposed_Matrix [][] , int matrix[][]) {
        for(int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix[0].length ; j++) {
                Transposed_Matrix[j][i] = matrix[i][j] ; 
            }
        }
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the no. of rows and cols: ");
        int n = sc.nextInt() ; 
        int m = sc.nextInt() ; 
        int matrix[][] = new int [n][m] ;
        for (int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix[0].length ; j++) {
                System.out.println("Enter the element: ") ; 
                matrix[i][j] = sc.nextInt() ; 
            }
        }
        System.out.println("Matrix created successfully.");

        DisplayMatrix(matrix);

        int Transposed_Matrix [][] = new int[m][n] ; 
        Transpose_Matrix(Transposed_Matrix, matrix);
        DisplayMatrix(Transposed_Matrix);
        sc.close();
    }
}

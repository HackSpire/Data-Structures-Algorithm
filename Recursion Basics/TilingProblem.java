import java.util.* ;

public class TilingProblem {

    public static int tilingProblem (int n) {   // (2 x n) is the [floor or board size]
        // (1) Base case:
        if (n == 0 || n == 1) {
            return 1;
        }
        // (2) Kaam (Work):

        // (2.1) Vertical Choice
        int fnm1 = tilingProblem(n-1) ; 

        // (2.2) Horizontal Choice
        int fnm2 = tilingProblem(n-2) ;

        //total ways to tile the floor: 
        int totWays = fnm1 + fnm2 ; 

        // (3) Inner func call
        return totWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Total no. of ways: " + tilingProblem(n));
        sc.close(); 
    }
}

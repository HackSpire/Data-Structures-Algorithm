public class OptimizedPower {
    /*
    public static int optimizedPower (int x, int n) {   //O(n)
        //Base Case
        if (n == 0) {
            return 1 ; 
        }
        int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2) ;
        if (n % 2 != 0) {       //If n is odd.
            return x * halfPowerSq ; 
        }
        return halfPowerSq ;
    }
        Now also this is not optimized as it calls itself twice => Time Complexity = O(n)
        So to optimize this we call itself only once and store its value and then use.
        See below for optimized Code with Time Complexity => O(log n)
    */

    public static int optimizedPower (int x, int n) {   //O(log n)
        //Base Case
        if (n == 0) {
            return 1 ; 
        }
        int halfPower = optimizedPower(x, n/2) ;
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {       //If n is odd.
            return x * halfPowerSq ; 
        }
        return halfPowerSq ;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
    }
}

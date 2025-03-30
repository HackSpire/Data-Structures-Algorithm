import java.util.* ;
public class fibonacci {
    //method to calculate fibonacci of nth term
    public static int fib(int n) {
        if (n == 0 || n == 1) {     //Base Case
            return n;
        }
        int fib_n_minus_1 = fib(n-1) ;
        int fib_n_minus_2 = fib(n-2) ;
        int fib_n = fib_n_minus_1 + fib_n_minus_2 ;     //fib(n) = fib(n-1) + fib(n-2)
        return fib_n ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        System.out.println("Enter the nth number : ");
        int n = sc.nextInt() ; 
        System.out.println(fib(n));
        sc.close();
    }
}

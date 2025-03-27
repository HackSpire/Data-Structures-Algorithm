public class SumofNnaturalNumbers {
    public static int sumofNaturalNo(int n) {
        if (n==1) {
            return 1;
        }
        int sumofn_minus_1 = sumofNaturalNo(n-1) ; 
        n += sumofn_minus_1 ; 
        return n ; 
    }
    public static void main(String[] args) {
        int n = 10 ; 
        System.out.println(sumofNaturalNo(n));
    }
}

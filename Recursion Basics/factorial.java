public class factorial {
    public static int calcFactorial (int num) {
        if (num == 0) {
            return 1 ; //Base Condition
        }
        int fact_n_minus_1 = calcFactorial(num - 1);
        int fact_of_n = num *  fact_n_minus_1 ; 
        return fact_of_n ; 
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(calcFactorial(num));
    }
}

public class Odd_Or_Even {

    public static void oddOrEven(int num) {
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            //even case
            System.out.println("even number");
        }
        else{
            //odd case
            System.out.println("odd number");
        }
    }
    public static void main (String args[]) {
        oddOrEven(12);
        oddOrEven(3);
        oddOrEven(7);
        oddOrEven(8);
    }
}

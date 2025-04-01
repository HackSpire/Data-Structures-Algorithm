public class PrintBinaryStrings {
    //Case: (1) printBinaryStrings without consecutive 1's.
    public static void printBinStrings1 (int n , int lastPlace , String str) {
        //Base Case: 
        if (n == 0) {   //if n==0 then return the string itself.
                        //Either it will be empty or will be the binString.
            System.out.println(str);
            return;
        }
        /*
        //Kaam [Work]: 
        if (lastPlace == 0) {
            printBinStrings1(n-1,0, str + "0");
            printBinStrings1(n-1, 1, str + "1");
        }
        else{
            printBinStrings(n-1, 0, str + "0");
        }
        */

        //This logic can be shortened to:
        //Kaam [Work]

        printBinStrings1(n-1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings1(n-1, 1, str + "1");
        }

    }
    //Case (2): printBinStrings without consecutive 0's.
    public static void printBinStrings0 (int n, int lastPlace, String str) {
        //Base Case: (Same)
        if (n == 0) {
            System.out.println(str);
            return;
        }
        //Kaam [Work]
        printBinStrings0(n-1, 1, str + "1");
        if (lastPlace == 1) {
            printBinStrings0(n-1,0, str + "0");
        }
    }
    public static void main(String[] args) {
        System.out.println("Without consecutive 1's");
        printBinStrings1(3, 0, "");
        System.out.println("Without consecutive 0's");
        printBinStrings0(3,1,"") ;
    }
}

public class PrintBinaryStrings {

    public static void printBinStrings (int n , int lastPlace , String str) {
        //Base Case: 
        if (n == 0) {   //if n==0 then return the string itself.
                        //Either it will be empty or will be the binString.
            System.out.println(str);
            return;
        }
        /*
        //Kaam [Work]: 
        if (lastPlace == 0) {
            printBinStrings(n-1,0, str + "0");
            printBinStrings(n-1, 1, str + "1");
        }
        else{
            printBinStrings(n-1, 0, str + "0");
        }
        */

        //This logic can be shortened to:
        //Kaam [Work]

        printBinStrings(n-1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n-1, 1, str + "1");
        }

    }
    public static void main(String[] args) {
        printBinStrings(3, 0, "");
    }
}

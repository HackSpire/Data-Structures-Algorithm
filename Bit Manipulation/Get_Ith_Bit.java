import java.util.*;
public class Get_Ith_Bit {

    public static int GetIthBit(int num, int i) {
        int bitMask = (1<<i);
        if ((num & bitMask) == 0){
            return 0 ;
        }
        else {
            return 1; 
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the index (i): ");
        int i = sc.nextInt();
        System.out.println(GetIthBit(num,i));
        sc.close();
    }
}

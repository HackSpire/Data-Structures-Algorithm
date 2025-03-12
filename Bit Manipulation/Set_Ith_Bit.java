import java.util.*;

public class Set_Ith_Bit {

    public static int SetIthBit(int num, int i){
        int bitMask = (1<<i);
        return num | bitMask;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the index (i): ");
        int i = sc.nextInt();
        System.out.println(SetIthBit(num,i));
        sc.close();
    }
}

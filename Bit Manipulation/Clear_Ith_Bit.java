import java.util.Scanner;

public class Clear_Ith_Bit {

    public static int clearIthBit(int num,int i){
        int bitMask = ~(1<<i);
        return num & bitMask;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the index (i): ");
        int i = sc.nextInt();
        System.out.println(clearIthBit(num, i));
        sc.close();
    }    
}

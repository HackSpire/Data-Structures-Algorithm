import java.util.*;

public class Update_Ith_Bit {
    public static int setIthBit(int num,int i){
        int bitMask = (1<<i);
        return num | bitMask;
    }
    public static int clearIthBit(int num,int i){
        int bitMask = ~(1<<i);
        return num & bitMask;
    }

    public static int updateIthBit(int num,int i,int newBit){
        if (newBit == 0){
            return clearIthBit(num,i);
        }
        else{
            return setIthBit(num,i);
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the index (i): ");
        int i = sc.nextInt();
        System.out.println("Enter the newBit: ");
        int newBit = sc.nextInt();
        System.out.println(updateIthBit(num, i, newBit));
        sc.close();
    }
}

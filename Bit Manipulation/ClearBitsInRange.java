public class ClearBitsInRange {
    public static int clearBitsinRange(int num,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return num & bitMask ;
    }
    public static void main (String args[]){
        System.out.println(clearBitsinRange(900, 2, 7));
    }
    
}

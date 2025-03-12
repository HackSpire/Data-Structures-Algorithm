public class Clear_IBits {
    public static int clearIBits(int num,int i){
        int bitMask = (~0)<<i;
        return num & bitMask;
    }
    public static void main (String args[]){
        System.out.println(clearIBits(15, 2));
    }
}

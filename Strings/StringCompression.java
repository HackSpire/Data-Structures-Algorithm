import java.util.*;
//Sample input : aabcc
//Output: a2bc2
//Sample input : abc
//Sample output : abc
public class StringCompression {

    public static String compress(String str) {
        //aabcc
        String newStr = "" ;
        for(int i=0; i<str.length();i++){
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count ++ ;
                i++ ;
            }
            if (count > 1) {
                newStr += str.charAt(i);
                newStr += count.toString();
            }
            else{
                newStr += str.charAt(i);
            }
        }
        return newStr ; 
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("The compressed string is: " + compress(str));
        sc.close();
    }    
}

import java.util.* ;

public class PalindromeStrings {

    public static boolean isPalindrome (String str) {
        for (int i=0 ; i<str.length()/2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("Not A Palindrome!");
                return false ;
            }
        }
        System.out.println("Palindrome!");
        return true ;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in) ; 
        System.out.println("Enter a string: ");
        String input = sc.next() ; 
        isPalindrome(input) ; 
    }
}
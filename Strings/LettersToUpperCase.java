import java.util.* ; 
public class LettersToUpperCase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder ("") ; 
        //character at 0 index.
        sb.append(Character.toUpperCase(str.charAt(0))) ; 

        //for rest of the charcaters, loop.
        for (int i=1 ; i<str.length() ; i++) {
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i)) ; 
                i++ ; 
                sb.append(Character.toUpperCase(str.charAt(i))) ;
            }
            else {
                sb.append(str.charAt(i)) ; 
            }
        }
        return sb.toString();
    }
    
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter a string: "); 
        String str = sc.nextLine() ;  
        System.out.println("The updated string is: " + toUpperCase(str));
        sc.close() ; 
    }
}
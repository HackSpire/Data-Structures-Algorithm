import java.util.* ;

public class RemoveDuplicates {
    
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        // (1)Base case:
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // (2) Kaam
        char currChar = str.charAt(idx) ; //current character in str

        if (map[currChar - 'a'] == true) {
            //Duplicate exists
            removeDuplicates(str, idx + 1, newStr, map);
        }
        else {      //Duplicate not exists then add currChar to newStr and change map[] to true.
            map[currChar - 'a'] = true ; 
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        System.out.println("Enter the string: ");
        String str = sc.nextLine() ;
        StringBuilder newStr = new StringBuilder("") ;      //Empty String 
        boolean map [] = new boolean[26] ;  //Size:26 because the str will contain char in range 'a' to 'z'
        removeDuplicates(str, 0, newStr, map) ;
        sc.close();
    }
}

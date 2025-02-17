public class String_Substring {
    
    public static String substring (String str , int si , int ei) {
        String substr = "" ;
        for (int i=si ; i<ei ; i++) {
            substr += str.charAt(i) ; 
        }
        return substr ;
    }

    public static void main (String args[]) {
        String str = "HelloWorld" ; 
        
        System.out.println(substring(str,0,5));     //Function call. Output : "Hello"

        System.out.println(str.substring(0,5));     //Inbuilt function of Java. Output: "Hello" 
    }
}

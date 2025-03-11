import java.util.Arrays ;

public class StringAnagrams {
    public static void main (String args[]){
        String str1 = "heart";
        String str2 = "earth";
        //First - convert to lowercase so that we don't need to check for uppercase or lowercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //check the length of both strings.
        if(str1.length() == str2.length()){
            //convert to char[] array.
            char [] str1charArray = str1.toCharArray();
            char [] str2charArray = str2.toCharArray();
            //sort them
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //check if equal or not.
            if(Arrays.equals(str1charArray,str2charArray)){
                System.out.println(str1+" and "+str2+" are anagrams.");
            }
            else{
                System.out.println(str1+" and "+str2+" are not anagrams.");
            }
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagrams.");
        }
    }    
}

//.compareTo() returns 0 : str1 == str2
//.compareTo() return <0 => -ve value => str1 < str2
//.compareTo() return >0 => =ve value => str1 > str2
//.compareTo() compares in Lexographic order . 

//.compareTo() treats 'A' and 'a' differently .

//.comparetoIgnoreCase() treats 'A' and 'a' as same .
public class LexicographicalOrder {
    public static void main (String args[]) {
        String fruits [] = {"apple" , "mango" , "banana"} ; 
        String largest = fruits[0] ; 
        for (int i = 1 ; i<fruits.length ; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i] ; 
            }
        }
        System.out.println(largest);
    }
}

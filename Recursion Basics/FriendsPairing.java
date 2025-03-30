public class FriendsPairing {

    public static int friendsPairing (int n) {

        // (1) Base Case: 
        if (n == 1 || n == 2) {
            return n ;
        }
        // (2)Kaam [Work]:
        // Choice

        // (2.1) Single
        int fnm1 = friendsPairing(n-1) ;

        // (2.2) Pair
        int fnm2 = friendsPairing(n-2) ;
        int pairWays = (n-1) * fnm2 ;

        //totWays
        int totWays = fnm1 + pairWays ; 
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println("Total no. of ways: " + friendsPairing(10));
    }
}

public class ShortestPath {

    public static float getShortestPath (String path) {
        int x=0 , y=0 ; 
        for (int i=0 ; i<path.length() ; i++) {
            char dir = path.charAt(i) ;     //direction at i .
            //North condition.
            if (dir == 'N') {
                y++ ; 
            }
            //South condition.
            else if (dir == 'S') {
                y-- ; 
            }
            //East condition.
            else if (dir == 'E') {
                x++ ;
            }
            //West condition.
            else {
                x-- ;
            }
        }
        int Xsquare = x*x ; //(x2-x1)^2 but x1 = 0 .
        int Ysquare = y*y ; //(y2-y1)^2 but y1 = 0 .
        return (float) Math.sqrt(Xsquare + Ysquare) ; 
    }
    
    public static void main (String args[]) {
        String path = "WNEENESENNN" ; 
        System.out.println("Shortest path is: " + getShortestPath(path));
    }
}

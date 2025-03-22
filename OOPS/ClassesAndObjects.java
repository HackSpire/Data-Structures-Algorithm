public class ClassesAndObjects {
    public static void main (String args[]) {
        //Object name: p1 , new keyword initializes space for this objects properties & functions
        Pen p1 = new Pen();
        // .(dot operator) is used to access object's methods and attributes.
        p1.setColor("blue");
        System.out.println(p1.color);    
    }

}
class Pen {
    //Properties or (attributes):
    String color;
    int tip;

    //Functions or (behaviours):
    void setColor(String newColor) {
        color = newColor ;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

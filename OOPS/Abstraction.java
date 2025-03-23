/*
 * Abstraction is the hiding of unnecessary details and showing only the important parts to the user.
 * Types:- (1) Abstract classes     (2) Interfaces
 * Properties: 
 * - Can't create object of the abstract class.
 * - Can contain abstract and non-abstract methods.
 * - Can contain constructors.
 */

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}
abstract class Animal{      //abstract class
    //can conatin abstract / non-abstract methods.
    void eat(){         //non-abstract method
        System.out.println("Eats");
    }
    abstract void walk();   //abstract method -> Only the idea that there is a function named walk().
                            //Not the implementation.
}

class Horse extends Animal{
    void walk(){        // The derived class defines the implementation as required.
        System.out.println("walks on 4 legs.");
    }
}
/* 
 * Inheritance is when the attributes and methods of the base class are passed on to a derived class.
 * 
 * Types of Inheritance:-
 * 1) Single Level Inheritance: Base Class -> Derived Class
 * 2) Multi Level Inheritance: Base Class -> Derived Class -> Derived Class
 * 3) Hierarchial Inheritance: Base Class -> Derived Class , Base Class -> Derived Class
 * 4) Hybrid Inheritance: Base Class -> Derived Class, Base Class -> Derived Class -> Derived Class
 * Note: Multi Level Inheritance can't be done in Java but can be done in C++.
 * -_- Although multi level inheritance can be implemented indirectly using interfaces...
 */

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eats();       //base class method
        shark.breathe();    //base class method
        shark.swim();       //derived class method
    }
}
//Base or Parent class
class Animal {
    String color ;
    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//Child or Derived or Sub-class
class Fish extends Animal {
    int fins;
    void swim(){
        System.out.println("swims");
    }
}
/* 
* Inheritance is when the attributes and methods of the base class are passed on to a derived class.
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
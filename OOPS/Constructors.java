/* Constructors are special methods which are automatically called when object is created.
 * 
 * Properties of Constructor:
 * -They have the same name as the class.
 * -They don't have a return type.
 * -They are called once at the time of object creation only.
 * -Memory allocation happens after the constructor is called.
 * 
 * Types of Constructors: 
 * (1) Non-Parametarized Constructor    (2) Parametarized Constructor   (3) Copy Constructor
 */

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("HackSpire");
        Student s3 = new Student(12);
    }
}
class Student {
    String name ;
    int roll ; 

    //Non-Parametarized Constructor:
    Student() {
        System.out.println("constructor is called...");
    }
    //Parametarized constructor:
    Student(String name) {
        this.name = name ;
    }
    //Another Parametarized Constructor:
    Student(int roll) {
        this.roll = roll ;
    }
}
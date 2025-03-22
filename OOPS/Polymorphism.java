/*
 * Polymorphism happens when a same task can be done in multiple forms.
 * It is of two types:-
 * (1) Method Overloading/Compile Time Polymorphism :
 *  This happens when multiple methods with same name but different parameters are present .
 * (2) Method Overriding/Runtime Polymorphism
 *  This happens when the method name in the parent class and derived class is same but the definition differs. 
 */

//Example of Method Overloading / Compile Time Polymorphism :-
public class Polymorphism {
    public static void main(String[] args) {

        //Method Overloading
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,3));

        //Method Overriding
        Deer d = new Deer();
        d.eat();
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b ;
    }
    int sum(int a,int b, int c){
        return a+b+c ;
    }
    float sum(float a, float b){
        return a+b;
    }
}

//Example of Method Overriding / Runtime overriding :
class Animal {
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
public class Static_keyword {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {    //Main is always static as we want that only one main func exist for the whole code.
        Student s1 = new Student();
        s1.schoolName = "BMPS" ;
        Student s2 = new Student() ; 
        System.out.println(s2.schoolName); 
    }
    
}
class Student{
    static int returnPercentage(int phy,int chem,int maths) {
        return (phy+chem+maths) / 3 ;
    }
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name ;
    }
}

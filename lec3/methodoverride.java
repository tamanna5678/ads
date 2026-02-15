package lec3;

public class methodoverride {
    public static void main(String[] args) {
        Student s = new Student();
        s.details();
        s.details(1);
        s.details(1,1.5f);

    }
    
}
class Student{
    void details(){
        System.out.println("this is g31");
    }
    void details(int a){
        System.out.println("we are learning dsa");

    }
    void details(int a, float b){
        System.out.println("we are learning oop");

    }
}
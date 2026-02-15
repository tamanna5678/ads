package lec3;

public class inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.details();
        c.dsa();
        c.impl();
    }
}
    class parent{
        void details(){
            System.out.println("I am the DSA class");
        }
        void dsa() {
            System.out.println("We are learning DSA");
        }

    }
    class child extends parent{
        void impl(){
            System.out.println("I am in the OOP class");
        }
    }
    


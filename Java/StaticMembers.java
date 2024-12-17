class A{
    private int x;             // instance member variable
    private static int y;      //static var.

    void fun1(){
        y=22;
        x=5;
    }

    void fun2(){
        System.out.println(y);
    }

    void fun3(){
        y=45;
    }

    static void f(){
        System.out.println(y);
    }

    void f2(){
        System.out.println(x);
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        A a1= new A();
        a1.fun1();
        a1.fun2();

        A.f();     //called static member function

        A a2= new A();
        a2.fun3();
        a2.fun2();

        a1.fun2();
        a2.fun2();


        a2.f2();
        a1.fun1();
        a1.f2();
  
    }
}





// we can access private static members of a class in main class by:
// 1. use private members by creating functions in class and then access private members through functions
//           in main by creating object.
// 2. without object creation:  use static functions and access them without creating object.



// ClassesAndObjects.java
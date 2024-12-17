class Nokia1{
    int x, y;

    Nokia1(){
        System.out.println("Parent's constructor executed");
    }

    void f1(){
        System.out.println("Parent function 1 executed");
    }
    void f2(){
        System.out.println("Parent function 2 executed");
    }
}

// Single inheritance
class Nokia2 extends Nokia1{
    int z;

    void f3(){
        System.out.println("child function 1 executed");
    }

    Nokia2(){
        //calls super() on its own
        System.out.println("child's constructor executed");
    }
}

// Hierarchical inheritance
// class Nokia3 extends Nokia1{

// }

public class inherit {
    public static void main(String[] args) {
        Nokia2 n1= new Nokia2();
        n1.f1();
        n1.f2();
        n1.f3();
    }
}




//Types of Inheritance
//single inheritance, multi-level inheritance, hierarchical inheritance
//hybrid inheritance
//multiple inheritance can also be achieved using interface

//inheritance using constructor
// Execution sequence: Parent class, Child class    (even if calling sequence is child, parent)

//can use super() in child class to call Parent class constructor.
//although it is called by the compiler even if not written.
// use super() to pass arguments to parent class constructor. This helps child class to access private members 
//         of parent class indirectly.





// ThisK.java




abstract class Demo1{
    int x, y;

    void f1(){
        x=6;
        y=9;
    }

    abstract void f2();

    Demo1(){
        System.out.println("Parent's constructor");
    }
}

class Demo2 extends Demo1{
    int z;

    void f3(){
        z=7;
    }

    void f2(){

    }

    Demo2(){
        System.out.println("Child's constructor");
    }
}


public class Abs {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Demo2 d= new Demo2();
    }
}




// Abstract class can not be instantiated (object can't be created).
//can access members of abstract class using its child class object.
//if a function of a class is abstract, then the class needs to be made abstract.
//to access abstract function, override it in child class.

//To restrict user to create object of a class, make the constructor of the class private.

//Abstraction in Java refers to hiding the implementation details of a code and exposing 
//       only the necessary information to the user. 
//        It provides the ability to simplify complex systems by ignoring irrelevant
//           details and reducing complexity.

// INTERFACE
// interface can also not be instantiated.
// members are public, static and final by default.
// functions are public and abstract.  (but if made static by user then can be defined)
// implements keyword is used with child class to use interface as parent class.
// multiple inheritance can be achieved using interface.





// InterF.java
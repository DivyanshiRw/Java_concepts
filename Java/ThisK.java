class Example{
    int x, y;

    void f1(int x, int y){
        this.x=x;
        this.y=y;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}

class Example1 extends Example{
    int x, y;

    void f3(int x, int y){
        super.x=x;
        super.y=y;
        //super keyword passes values of x and y to parent class members x and y
    }

    void f4(){
        System.out.println(super.x);
        System.out.println(this.y);
    }

}

public class ThisK {
    public static void main(String[] args) {
        Example e1= new Example();
        e1.f1(7, 8);
        e1.display();

        Example1 e2= new Example1();
        e2.f3(45, 66);
        e2.f4();
    }
}




//every function contains a reference variable(this) which points to its own object (contains super as well)
// this is a keyword which refers to current object.

// super keyword is used to access methods of the parent class.
// this is used to access methods of the current class.

// POLYMORPHISM----- 
// the ability of objects to take on many forms. 
//In other words, it allows different objects to respond to the same message or method call in multiple ways.

// Method Overloading allows different methods to have the same name, 
//       but different signatures where the signature can differ by 
//          the number of input parameters or type of input parameters, or a mixture of both.

// Overriding is a feature that allows a subclass or child class to provide a specific implementation
//       of a method that is already provided by one of its super-classes or parent classes.
//       When a method in a subclass has the same name, the same parameters or signature, and the
//      same return type(or sub-type) as a method in its super-class, then the method in
//       the subclass is said to override the method in the super-class.




// Abs.java
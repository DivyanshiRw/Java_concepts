class Demo{
    int x,y;
    Demo(){
        //System.out.println("Constructor 1 executed");
        x=7;
        y=9;
    }

    void f1(){
        //System.out.println("Function 1 executed");
        x=22;
        y=87;
    }

    Demo(int p, int q){
        //parameterized constructor
        x=p;
        y=q;
    }
}

public class Construct {
    public static void main(String[] args) {
        Demo d1= new Demo();
        System.out.println(d1.x);
        System.out.println(d1.y);
        //Demo d2= new Demo();
        d1.f1();
        Demo d3= new Demo();
        System.out.println(d3.x);
        System.out.println(d3.y);


        Demo dp= new Demo(56, 34);
        System.out.println(dp.x);
        System.out.println(dp.y);

    }
}



// Constructor
// A constructor in Java is a special method that is used to initialize objects. 
// The constructor is called when an object of a class is created.
//Types:
// Default construcror(created by compiler)
// No-Argument constructor(user-defined)
// Parameterized constructor(user-defined)

//Garbage collector deletes unreferenced objects.





// inherit.java
interface i1{
    int x=7;
    void f1();

    static void f2(){
        System.out.println(x);     // function can be defined in interface by making it static
    }
}

interface i2 extends i1{
    int y=9;
    void f3();
}

class c1 implements i2{
    public void f1(){

    }

    public void f3(){

    }
}

public class InterF {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        i1.f2();
        c1 c= new c1();
        System.out.println(c.x);
        System.out.println(c.y);
    }
}




//constructor do not exist in interface because values need to be assigned during declaration since var. are final.
// no need to assign values in interface because var. are public, static and final.

// **** static function is not inherited in inheritance. (but static var. are inherited)


// Multithreading
//Multithreading is a Java feature that allows concurrent execution of two or more parts of a program 
//      for maximum utilization of CPU. Each part of such program is called a thread.
//         So, threads are light-weight processes within a process.
//two ways to implement multithreading
//1. using Runnable Interface
//2. using Thread class





// MultiT.java
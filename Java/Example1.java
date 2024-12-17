class Area{
    static void fun1(){
        System.out.println("Area 1");
    }

    static void fun2(){
        System.out.println("Area 2");
    }
}

public class Example1 {

    static void fun1(){
        System.out.println("A");
    }

    static void fun2(){
        System.out.println("B");
    }
    public static void main(String []args){
        System.out.println("C");
        fun1();
        fun2();
        Area.fun1();
        Area.fun2();
    }
}


// We can create multiple functions/ methods inside a class.
// Main function is mandatory to create as compiler runs main function.
// we can call other functions inside main but functions should be static.
//  Non-static functions can't be called directly.

// Different classes can be created and their functions(static) can be called in main class using..
// CLASS_NAME.FUNC_NAME
// main class functions can also be called this way.




// Object1.java
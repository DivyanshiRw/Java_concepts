class Mohan{
    int x;     //instance(object) member variable
    int y;     //instance(object) member variable
    @SuppressWarnings("unused")
    private int z;

    void fun1(){        //instance(object) member function
        System.out.println("Fun 1");
    }

    void fun2(){        //instance(object) member function
        System.out.println("Fun 2");
    }
}

public class Object1 {
    public static void main(String []a){
        Mohan m1= new Mohan();
        Mohan m2= new Mohan();
        m1.x=5;
        m2.x=7;
        System.out.println(m1.x);
        System.out.println(m1.y);

        System.out.println(m2.x);
        System.out.println(m2.y);

        // System.out.println(m1.z);

    }
}




// we can access non-static functions by creating their objects and then using objects to access them in main
// CLASS_NAME ref_var= new CLASS;
// Default value of undefined variable= 0
// if we create another object for a class then new object will reference to class and previous object...
// ...will no longer refer to class. Garbage collector will remove unreferenced block.

// types of access specifiers: public, private, protected, default
// we can't access private members of a class directly in main class.


// StaticMembers.java





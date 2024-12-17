package Package2;
import Package1.Amit;

public class Sumit {
    public static void main(String[] args) {
        Amit a1= new Amit();
        a1.setData(7, 9);
        a1.display();
    }
}




// PS C:\Users\divya\OneDrive\Desktop\Coding\Java> javac -d . Sumit.java
// PS C:\Users\divya\OneDrive\Desktop\Coding\Java> java Package2.Sumit



// Access Specifiers
// Public, Private, Protected, Default

// Public---- members accessible outside the class, outside the program, outside the package
// Private---- members accessible only inside the class
// Protected---- access level is within the package & outside package through child class
// Default---- members accessible outside the class, outside the program(same package).... access level is within 
//        the package.If access level is not specified, it is Default.

// non access modifiers-
// static, abstract, synchronized, native, volatile, transient





//Construct.java
package Package1;

public class Amit{
    private int x;
    private int y;

    public void setData(int p, int q){
        x=p;
        y=q;
    }

    public void display(){
        System.out.println(x);
        System.out.println(y);
    }
}




// if class is Public, then filename and class name should be same.
// if class is not public(it is default) then we can have different filename.
// if a class contains main function, then filename should be same as class name.
// class and function should be public if needs to be accessed by some other file.


// to compile this file and create package(folder):
// PS C:\Users\divya\OneDrive\Desktop\Coding> cd Java
//PS C:\Users\divya\OneDrive\Desktop\Coding\Java> javac -d . Amit.java



// Sumit.java
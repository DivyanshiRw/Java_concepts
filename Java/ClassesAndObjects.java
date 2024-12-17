class Nokia{
    private int mic;
    private int cam;

    void setVal(){
        mic= 7;
        cam= 51;
    }

    void display(){
        System.out.println(mic);
        System.out.println(cam);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Nokia n= new Nokia();
        n.display();
        n.setVal();
        n.display();
    }
}




// class cannot be private or protected (but inner class can be)
// no function can be created outside classes



//Wrap.java

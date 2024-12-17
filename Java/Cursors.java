import java.util.*;

public class Cursors {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Vector v1= new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");

        //Enumeration
       /*  
       Enumeration k1= v1.elements();
        while(k1.hasMoreElements()){
            System.out.println(k1.nextElement());
        }
        */

        //Iterator
        /* 
        Iterator e1= v1.iterator();
        while (e1.hasNext()) {
            String s1= (String)e1.next();
            if(s1=="C" || s1=="B"){
                e1.remove();
            }
            else{
                System.out.println(s1);
            }
        }
         */

         // ListIterator
         ListIterator l1= v1.listIterator();

         while (l1.hasNext()) {
            System.out.println(l1.next());
         }

         while (l1.hasPrevious()) {
            System.out.println(l1.previous());
         }


         ListIterator l2= v1.listIterator();
         while (l2.hasNext()) {
            String s1= (String)l2.next();
            if (s1.equals("A")){
                l2.set("C Programming");
            }
            else if(s1.equals("B")){
                l2.set("C++");
            }
            else if(s1.equals("C")){
                l2.add("Python");
            }
            else if (s1.equals("D")){
                l2.remove();
            }
            System.out.println(s1);
         }

         l2= v1.listIterator();
         while (l2.hasNext()) {
            System.out.println(l2.next());
         }


    }
}




// Cursors
//There are 3 cursors in java.
//Enumeration, Iterator, ListIterator


//Enumeration
//It is an interface.
//introduced in 1.0, thus only available for legacy classes.(vector & stack)
//-----------------functions
//boolean hasMoreElements()
//E nextElement()

// Iterator
//available for all collection implemented classes.
//-------------functions
//boolean hasNext()
//object next()
//void remove()


//limitations:
//Enumeration and iterator both can move in one direction only.
//only read and remove operations are available.
//not able to add new object.
//not able to replace (can remove not replace)


// ListIterator
//child interface of iterator
//bidirectional cursor
//all classes can implement listIterator()
//--------------------functions
//boolean hasNext()
//object next()
//void remove()
//boolean hasPrevious()
//E previous()
//void add(E e)
//void set(E e)
//nextIndex()
//previousIndex()



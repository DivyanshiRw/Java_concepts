import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        ArrayList<String> l1= new ArrayList<>();
        l1.add("A");             //Collection function
        l1.add("B");
        l1.add("C");
        // System.out.println(l1);

        //List Function
        l1.add(2, "G");

        Iterator g1= l1.iterator();
        while (g1.hasNext()) {
            System.out.println(g1.next());
        }

        // while (g1.hasNext()) {
        //     String s1= (String)g1.next();
        //     if(s1!= "G"){
        //         System.out.println(s1);
        //     }
        // }
    }
}




// List     ---FUNCTIONS               (interface)
//void add(int index, E element)
//E set(int index, E element)
//E get(int index)
//int indexOf(Object o)
//int lastIndexOf(Object o)
//E remove(int index)
//List<E> subList(int fromindex, int toindex)

// ArrayList creates 10 blocks by default on initialization if size isn't given.

// ArrayList
//It is defined using dynamic arrays.
//It is resizable.
//Duplicates are allowed.
//Order of elements are preserved.
//Null insertion is possible.
//Heterogeneous objects are allowed.     (heterogeneous data is not allowed only in TreeSet and TreeMap)
// Arraylist capacity increases as:  (current_capacity * 3/2)+1
// In ArrayList, elements are stored in contiguous memory locations.
//Insertion in middle requires massive shift which reduces performance.
//insertion and deletion is costly.

// LinkedList
//elements are not necessarily stord in contiguous memory locations.
//accessing nth element is costly.
//--------------------- FUNCTIONS
//void addFirst(Object o1)
//void addLast(Object o1)
//Object getFirst()
//Object getLast()
//Object removeFirst()
//Object removeLast()





// Collection2.java




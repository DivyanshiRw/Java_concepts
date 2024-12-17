import java.util.HashSet;

public class HSet {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        HashSet h1= new HashSet();
        h1.add("C");
        //h1.add("C++");
        h1.add("Core Java");
        //h1.add("Python");
        System.out.println(h1);
        
        System.out.println(h1.add("C"));
        System.out.println(h1.add("C++"));
        System.out.println(h1.add("Core Java"));
        System.out.println(h1.add("Python"));
    }
}





// LinkedHashSet
//child class of HashSet
//Insertion order is preserved
//hashset and doubly linked list both are used here (Hybrid DS)

// SortedSet      (interface)
//duplicates are not allowed
//elements are in sorted order
//heterogeneous data not allowed
//---------------------functions
//first()
//last()
//headSet(E toElement)
//tailSet(E fromElement)
//subset(E fromElement, E toElement)
//comparator()

// NavigableSet------------
//ceiling()
//floor()
//higher(E e)
//lower(E e)
//pollFirst()
//pollLast()





//  Cursors.java



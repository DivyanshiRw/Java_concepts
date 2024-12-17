import java.io.*;

public class FileH2 {
    public static void main(String[] args) throws IOException{
        // File h1= new File("a.txt");
        // FileOutputStream f1= new FileOutputStream(h1);
        // f1.write('D');

        FileOutputStream f1= new FileOutputStream("a.txt", true);
        String s1= "Divyanshi Rawat";

        char c1[]= s1.toCharArray();
        for(int i=0; i< c1.length; i++){
            f1.write(c1[i]);
        }

        f1.close();
    }
}






// Collection Framework
// Collection is an interface.

// Collections is a class.    
//    ---- all functions of this class are static. So we can access its functions using Collections.func_name


// Collection           (interface)
// ------> List          (interface)
// ------> Set           (interface)
// ------> Queue         (interface)

// 3 components of Collection
// containers, algorithms, cursors

// Stack is a child class of Vector (List) but is called legacy class.

// size of vector increases by double.  (1-> 2-> 4-> 8.......)
// Vector is Synchronized(so it is slow). Thread safe.
//Array is Unsychronized(fast). Array is not thread safe.

// List             (classes under List)
//---- ArrayList
//---- LinkedList
//---- Vector
//       ---Stack

// Set
//---- HashSet                  (class)
//     ---LinkedHashSet
//-----SortedSet                (interface)
//     ----NavigableSet          (interface)
//         ---TreeSet            (class)

// Queue
//----PriorityQueue
//----BlockingQueue
//    ---PriorityBlockingQueue
//    ---LinkedBlockingQueue


// Map          (classes under Map)
//----HashMap
//    ---LinkedHashMap
//----WeakHashMap
//----IdentityHashMap
//----HashTable
//    ---Properties
//-----SortedMap                 (interface)
//     ----NavigableMap          (interface)
//         ---TreeMap             (class)



// Functions of Collection
//boolean add(Object o1)
//boolean addAll(Collection c1)
//boolean remove(Object o1)
//boolean removeAll(Collection c1)
//boolean retainAll(Collection c1)                        (remove everything except c1)
//int size()
//boolean contains(Object o1)
//void clear()
//boolean isEmpty()
//Iterator iterator()                     (interface)





// Collection1.java


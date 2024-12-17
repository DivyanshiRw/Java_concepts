import java.util.*;

public class Collection2 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        LinkedList l1= new LinkedList();
        l1.addFirst("Divyanshi");
        l1.addLast("Rawat");
        l1.add(1, "20");
        System.err.println(l1.get(1));
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

        //Stack
        Stack s1= new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println(s1.search(30));
    }
}



// Vector
//vector increases its size by double.
//duplicates are allowed.
//insertion order is preserved.
//null insertion is allowed.
//heterogeneous
//methods are synchronized. so, thread safe.
//------------------- FUNCTIONS
//void addElement(Object)
//     clear()
//     clone()
//     contains(Object o)
//     containsAll(Collection c1)
//     copyInto(Object[] array)
//     elements()
//     addAll()
//int capacity()
//boolean equals(Object o)
//     firstElement()


// Stack
// First In Last Out/ Last In First Out
//subclass/child class of vector
//--------------- FUNCTIONS
//push()
//pop()
//peek()
//empty()
//search(Object o)


// Set
//duplicates are not allowed.
//Insertion order is not preserved but all objects are inserted based on hash code.
//heterogeneous objects are allowed.
//null values are allowed.
//hashing provides efficient searching.

//HashSet
//default capacity is 16.
//After 75% hashset is filled, it grows dynamically.
//by default, load factor= 0.75
//----------------------------
//HashSet(int capacity)
//HashSet(int capacity, float load_Factor)
//HashSet(Collection c)




// HSet.java
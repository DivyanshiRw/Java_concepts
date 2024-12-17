import java.util.Scanner;

class Account{
    int bal;
    Account(int b){
        bal= b;
    }

    boolean isSufficientBal(int w){
        if (bal> w){
            return true;
        }
        else{
            return false;
        }
    }

    void withdraw(int amt, String g1){
        bal= bal- amt;
        System.out.println(g1+ " Transaction Successful.");
        System.out.println(g1+ " Current Balance is: "+ bal);
    }
}

class Customer implements Runnable{
    Account x1;
    String s1;
    Customer(Account j1, String h1){
        x1= j1;
        s1= h1;
    }

    @SuppressWarnings("resource")
    public void run(){
        Scanner sc= new Scanner(System.in);

        synchronized(x1){
        System.out.println("Enter amount to withdraw for "+ s1+ " : ");
        int amt= sc.nextInt();
        if (x1.isSufficientBal(amt)){
            x1.withdraw(amt, s1);
        }
        else{
            System.out.println("Insufficient Balance");
        }
        }
    }
}

public class ThreadSyn {
    public static void main(String[] args) {
        Account a1= new Account(5000);
        Customer c1= new Customer(a1, "Amit");
        Customer c2= new Customer(a1, "Sumit");

        Thread t1= new Thread(c1);
        Thread t2= new Thread(c2);
        t1.start();
        t2.start();
    }
}




// Multi-threaded programs may often come to a situation where multiple threads try to access
//     the same resources and finally produce erroneous and unforeseen results.

// Synchronization is used to make sure by some synchronization method that only one thread 
//      can access the resource at a given point in time.

// Java provides a way of creating threads and synchronizing their tasks using synchronized blocks. 

// A synchronized block in Java is synchronized on some object.
// All synchronized blocks synchronize on the same object and can only have one thread executed inside
//      them at a time. All other threads attempting to enter the synchronized block are blocked until 
//         the thread inside the synchronized block exits the block. 

// Synchronized blocks in Java are marked with the synchronized keyword. 





// MultiT3.java
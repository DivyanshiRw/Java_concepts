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

    void withdraw(int wb){
        bal= bal- wb;
        System.out.println("Transaction Successful.");
        System.out.println("Current Balance is: "+ bal);
    }
}

class Customer implements Runnable{
    Account h1;
    String name;
    Customer(Account g1, String s1){
        h1= g1;
        name= s1;
    }

    public void run(){
        synchronized(h1){
        Scanner sc= new Scanner(System.in);
        System.out.println(name+ ", Enter amount to withdraw: ");
        int amt= sc.nextInt();
        if (h1.isSufficientBal(amt)){
            h1.withdraw(amt);
        }
        else{
            System.out.println(name+ ", Insufficient Balance");
        }
        }
    }

}

public class MultiT3 {
    public static void main(String[] args) {
        Account a1= new Account(1000);
        Customer c1= new Customer(a1, "Payal");
        Customer c2= new Customer(a1, "Pawan");

        Thread t1= new Thread(c1);
        Thread t2= new Thread(c2);
        t1.start();
        t2.start();
    }
}




// In Java, Scanner is a class in java.util package used for obtaining the input of the
//       primitive types like int, double, etc. and strings.

// To create an object of Scanner class, we usually pass the predefined object System.in, which represents 
//     the standard input stream. We may pass an object of class File if we want to read input from a file.

//To read strings, we use nextLine().
//To read a single character, we use next().charAt(0).
//     next() function returns the next token/word in the input as a string and 
//      charAt(0) function returns the first character in that string.






// ExceptionH1.java
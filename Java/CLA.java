public class CLA {
    public static void main(String[] args) {
        // Average of numbers using command line arguments
        int s=0;
        for(int i=0; i< args.length; i++){
            s= s+ Integer.parseInt(args[i]);
        }
        System.out.println("Average is: "+ (s/ args.length));
    }
}

// output:
// PS C:\Users\divya\OneDrive\Desktop\Coding\Java> javac CLA.java
// PS C:\Users\divya\OneDrive\Desktop\Coding\Java> java CLA 22 7 33 14 5 11
// Average is: 15



// command line arguments are used to pass arguments to the main program.
// If you look at the Java main method syntax, it accepts String array as an argument.
//  When we pass command-line arguments, they are treated as strings and passed to the main function
//          in the string array argument.




// Amit.java

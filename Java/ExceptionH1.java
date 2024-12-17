public class ExceptionH1 {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        String s1= null;
        try{
        System.out.println(s1.length());
        }
        catch(NullPointerException n1){
            System.out.println(n1.getMessage());
        }

        System.out.println("A");

        try{
        System.out.println(5/0);
        }
        catch(ArithmeticException e1){
            System.out.println(e1.getMessage());
        }

        System.out.println("B");

        // can use multiple catch blocks as well
        // try{
        //     System.out.println(s1.length());
        //     System.out.println(5/0);
        // }
        // catch(NullPointerException n1){
        //     System.out.println(n1.getMessage());
        // }
        // catch(ArithmeticException e1){
        //     System.out.println(e1.getMessage());
        // }

        
    }
}




// Exception handling
//Exception Handling in Java is one of the powerful mechanism to handle the runtime errors
//     so that the normal flow of the application can be maintained.
//an exception is an event that occurs during the execution of a program that disrupts
//      the normal flow of instructions. 

//4 conditions
// default throw default catch, default throw our catch, our throw default catch, our throw our catch
// Java catches(default catch)----> program terminates

// Throwable CLASS (getMessage(), setMessage())
//----> Error
//----> Exception

// try, catch, throw, finally, throws




// ExceptionH2.java
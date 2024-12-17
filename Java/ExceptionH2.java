public class ExceptionH2 {
    public static void main(String[] args) {
        int cb= 10000;
        int wb= 14000;
        
        try{
            if(cb<wb){
                throw new ArithmeticException("Insufficient Balance");
            }
        cb= cb-wb;
        System.out.println("Transaction Successful");
        System.out.println("Current Balance is "+ cb );
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This block will always run");
        }
    }
}


// why throw?
// to set error message, compiler doesn't know all the exceptions
//The throw statement throws a user-defined exception.

//try
//The "try" keyword is used to specify a block where we should place an exception code. It means
//     we can't use try block alone. The try block must be followed by either catch or finally.

//catch
//The "catch" block is used to handle the exception. It must be preceded by try block 
//    which means we can't use catch block alone. It can be followed by finally block later.

//finally
//The "finally" block is used to execute the necessary code of the program. It is executed
//      whether an exception is handled or not.

//throw
//The "throw" keyword is used to throw an exception.

//throws
//The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception
//        in the method. It doesn't throw an exception. It is always used with method signature.


//Compile time exception----> checked exception
// IOException, SQLException, ClassNotFoundException

// Runtime exception-----> unchecked exception



//ExceptionH3.java
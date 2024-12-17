import java.io.IOException;

import javax.imageio.IIOException;

public class ExceptionH3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("D");

        try{
        throw new IIOException("Printer not found");
        }
        catch(IIOException e1){
            System.out.println(e1.getMessage());
        }

    }
}



// The Throw keyword is used inside a method. Whereas the Throws keyword is used in the method signature.
// The Throw keyword throws an exception explicitly. Whereas the Throws keyword declares
//         that a method might throw an exception.
// Throw syntax is followed by an instance of exception to be thrown. In contrast, the Throws syntax 
//         is followed by the class names of exceptions to be thrown.
// The number of exceptions that can be thrown using the Throw keyword is only one. In contrast, the
//           number of exceptions that can be thrown using the Throws keyword is multiple.






// LoginS.java
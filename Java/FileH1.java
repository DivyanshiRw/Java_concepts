import java.io.*;

public class FileH1 {
    public static void main(String[] args) throws IOException {
        File f1= new File("a.txt");
        // System.out.println(f1.exists());            false
        // System.out.println(f1.canWrite());          false
        // System.out.println(f1.length());            0

        // need to run only 1 time to create file

        // f1.createNewFile();

        System.out.println(f1.exists());
        System.out.println(f1.canWrite());
        System.out.println(f1.length());

    }
}



// File Handling
// Text files, Binary Files(image, audio, video)

// 3 Logical steps of file handling
//1. Opening a file
//2. Processing
//3. Closing a file

// FileOutputStream      (class)
//FileOutputStream(File f1)
//FileOutputStream(File f1, Boolean append)            ---boolean append is false by default
//FileOutputStream(String path)
//FileOutputStream(String path, Boolean append)






// FileH2.java

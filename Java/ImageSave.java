import java.sql.*;
import java.io.*;

public class ImageSave {
    public static void main(String[] args) {
        try{
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //creating connection
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/java_jdbc", "root", "Diya@1234");


            String q= "insert into images(pic) values(?)";

            PreparedStatement pstmt= con.prepareStatement(q);

            FileInputStream fis= new FileInputStream("krishna.jpg");
            pstmt.setBinaryStream(1, fis);

            pstmt.executeUpdate();

            System.out.println("Done.....");

            con.close();



        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

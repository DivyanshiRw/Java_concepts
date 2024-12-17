import java.sql.*;
import java.io.*;

public class fun2 {
    public static void main(String[] args) {
        try{
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //creating connection
            String url= "jdbc:mysql://localhost:3306/java_jdbc";
            String username= "root";
            String password= "Diya@1234";

            Connection con= DriverManager.getConnection(url, username, password);

            //create query
            String q= "insert into table_1(tName, tCity) values(?, ?)";
            
            //get PreparedStatement object
            PreparedStatement pstmt= con.prepareStatement(q);

            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name: ");
            String name= br.readLine();

            System.out.println("Enter city: ");
            String city= br.readLine();


            
            //set the values to query
            pstmt.setString(1, name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();
            System.out.println("Inserted...");
            

            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}






//ImageSave.java
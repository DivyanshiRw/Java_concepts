import java.sql.*;

public class fun {
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
            
            //set the values to query
            pstmt.setString(1, "Divyanshi");
            pstmt.setString(2,"Gurugram");

            pstmt.executeUpdate();
            System.out.println("Inserted...");
            

            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}





//fun2.java
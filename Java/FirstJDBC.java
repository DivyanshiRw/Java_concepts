import java.sql.*;

public class FirstJDBC {
    public static void main(String[] args) {
        try{
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //creating connection
            String url= "jdbc:mysql://localhost:3306/java_jdbc";
            String username= "root";
            String password= "Diya@1234";

            Connection con= DriverManager.getConnection(url, username, password);

            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("Connection created successfully...");
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}





//InsertJDBC.java
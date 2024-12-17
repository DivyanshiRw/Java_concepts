import java.sql.*;

public class InsertJDBC {
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
            String q= "create table table_1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
            
            //create statement
            Statement stmt= con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created successfully...");

            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}





//fun.java
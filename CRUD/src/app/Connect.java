package app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect {
    public static Connection getConnection(){
        String url = "jdbc:sqlserver://DESKTOP-8HV457O\\SQLEXPRESS:1433;"
                     +"user=sa;password=123;databaseName=student;encrypt=false";
        try{
         Connection con = DriverManager.getConnection(url);
         return con;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }           
    }
}

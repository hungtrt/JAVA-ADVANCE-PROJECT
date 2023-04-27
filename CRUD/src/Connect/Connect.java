package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect {
    public static void main(String[] args) {
        getConnection();
    }

    public static void getConnection() {
        String connUrl = "jdbc:sqlserver://DESKTOP-8HV457O\\SQLEXPRESS:1433;"+"user=sa;password=123;databaseName=student;encrypt=false";
        try (Connection conn = DriverManager.getConnection(connUrl)){
            System.out.println("Successfully!");
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
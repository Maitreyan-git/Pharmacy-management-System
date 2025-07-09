package db;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost/medicalstore", "root", "Nithish@21"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

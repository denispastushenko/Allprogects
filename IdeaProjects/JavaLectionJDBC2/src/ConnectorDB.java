import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectorDB {
    public  static Connection getConnection() throws SQLException, FileNotFoundException {


        return DriverManager.getConnection("jdbc:mysql://localhost/jdbs","root",
                "root");
    }
}

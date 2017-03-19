import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Connection cn = null;
        try {
            cn = ConnectorDB.getConnection();
            Statement st = null;
            st = cn.createStatement();
            ResultSet rs = null;
            rs = st.executeQuery("select * from list_");
            ArrayList<Abonent> lst = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int phone = rs.getInt(3);
                lst.add(new Abonent(id,name,phone));
            }
            lst.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

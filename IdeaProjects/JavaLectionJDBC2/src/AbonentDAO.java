import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AbonentDAO extends AbstractDAO<Integer,Abonent>{

    @Override
    public List<Abonent> findAll() {
        ArrayList<Abonent> lst = new ArrayList<>();
        Connection cn = null;
        try {
            cn = ConnectorDB.getConnection();
            Statement st = null;
            st = cn.createStatement();
            ResultSet rs = null;
            rs = st.executeQuery("select * from list_");

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int phone = rs.getInt(3);
                lst.add(new Abonent(id,name,phone));
            }
            lst.forEach(System.out::println);
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return lst;
    }

    @Override
    public Abonent findEntitYBYId(Integer Id) {
        return null;
    }

    @Override
    public boolean delete(Integer Id) {
        return false;
    }

    @Override
    public boolean delete(Abonent entity) {
        return false;
    }

    @Override
    public boolean create(Abonent entity) {
        return false;
    }

    @Override
    public Abonent update(Abonent entity) {
        return null;
    }


}

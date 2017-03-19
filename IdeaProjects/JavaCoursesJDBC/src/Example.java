import java.sql.*;

public class Example {
    private static final   String connect = "jdbc:mysql://192.168.201.1:3306/courseexample";
    private  static final String REQUEST = "select * from s";
    public static void main(String[] args) {
        try {
            String pass = "root";
            String name = "root";
            Connection connection = DriverManager.getConnection(connect, name, pass);
            System.out.println("connected");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(REQUEST);
            while (resultSet.next()){
                System.out.println("_________________");
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getInt(4));
                System.out.println(resultSet.getDouble(5));
                System.out.println("********************");
            }
            connection.close();
            System.out.println("disconnected");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

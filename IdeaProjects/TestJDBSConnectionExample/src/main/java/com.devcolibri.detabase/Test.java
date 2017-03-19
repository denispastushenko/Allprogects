package com.devcolibri.detabase;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Calendar;

public class Test {
    private static final String URL = "jdbc:mysql://localhost:3306/instagramtestjdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String INSERT_INTO = "INSERT INTO test VALUES(?,?,?)";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            preparedStatement = connection.prepareStatement(INSERT_INTO);
            //preparedStatement.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
            int i =0;
            while ( i <100){if (i==10)break;
                preparedStatement.setString(3, "Vikus");
                preparedStatement.setInt(1,4);
                preparedStatement.setBlob(2, new FileInputStream("C:\\Users\\Denys\\Desktop\\pianeta-terra.jpg"));
                preparedStatement.execute();
                i++;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
//statement.executeUpdate("DELETE FROM photos");

}



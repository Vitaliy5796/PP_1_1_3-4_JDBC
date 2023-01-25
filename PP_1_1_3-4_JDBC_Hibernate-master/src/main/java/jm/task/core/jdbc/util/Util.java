package jm.task.core.jdbc.util;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/test1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection connection;

    public static Connection getDbConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

}



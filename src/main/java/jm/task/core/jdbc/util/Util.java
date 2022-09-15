package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String HOST = "jdbc:mysql://127.0.0.1:3306/mytest?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String USERNAME = "Userroot";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(HOST, USERNAME,PASSWORD);
            if (!connection.isClosed()) {System.out.println("Соединение установлено!");}
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

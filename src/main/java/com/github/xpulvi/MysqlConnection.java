package com.github.xpulvi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
    public static void main(String[] args) {


        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:mysql://localhost:3306/mysqljdbc";
            String user = "root";
            String password = "secret";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            // more processing here
            // ...
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null)
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}

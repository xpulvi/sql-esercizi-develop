package sqL3;

import com.github.xpulvi.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Sql03 {

        public static void main(String[] args) {



            // db parameters
            String url       = "jdbc:mysql://localhost:3306/newdb";
            String user      = "developer";
            String password  = "test";

            try (Connection conn = DriverManager.getConnection(url, user, password)){


                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
                List<String> surnames = new ArrayList<>();
                while (resultSet.next()){
                    System.out.println(resultSet.getString("last_name"));

                    surnames.add(resultSet.getString("first_name"));
                };

                System.out.println(surnames);

            } catch(SQLException e) {
                System.out.println(e.getMessage());
            } finally {

            }
        }
    }




package sqL5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class View {
    public static void main(String[] args) throws SQLException {

        // db parameters
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "developer";
        String password = "test";
        Statement statement = null;

        try (Connection conn = DriverManager.getConnection(url, user, password)) {


             statement = conn.createStatement();
            //create query
            String query = "CREATE VIEW viewItalians AS SELECT last_name, first_name FROM students WHERE country = 'Italy';";

            statement.executeUpdate(query);

            query = "CREATE VIEW viewGerman AS SELECT last_name, first_name FROM students WHERE country = 'german';";
            statement.executeUpdate(query);

            //select
            statement.executeUpdate("SELECT * FROM viewItalians");

            ArrayList<Student> studentsIta = new ArrayList<>();
            ArrayList<Student> studentsGer = new ArrayList<>();

            studentsIta.add();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            statement.close();
        }

    }


}
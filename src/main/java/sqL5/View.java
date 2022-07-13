package sqL5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class View {
    public static void main(String[] args) throws SQLException {

        // db parameters
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "developer";
        String password = "test";
        Statement statement = null;
        ResultSet resultSet = null;
        ResultSet resultSet2 = null;
        try (Connection conn = DriverManager.getConnection(url, user, password)) {


             statement = conn.createStatement();
            //create query
            String query = "CREATE VIEW italian_students AS SELECT last_name, first_name FROM students WHERE country = 'Italy';";

            statement.executeUpdate(query);

            query = "CREATE VIEW german_students AS SELECT last_name, first_name FROM students WHERE country = 'Germany';";
            statement.executeUpdate(query);



            //list obj studentsIta
            ArrayList<Student> studentsIta = new ArrayList<>();
            resultSet = statement.executeQuery("SELECT * FROM italian_students");
            //put result on ArrayList
            while(resultSet.next()){
                String name = resultSet.getString("first_name");
                String surname = resultSet.getString("last_name");
                studentsIta.add(new Student(name, surname));
            }



            //select students italian
            resultSet2 = statement.executeQuery("SELECT * FROM german_students");
            ArrayList<Student> studentsGer = new ArrayList<>();
            while(resultSet2.next()){
                String name = resultSet2.getString("first_name");
                String surname = resultSet2.getString("last_name");
                studentsGer.add(new Student(name, surname));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            //statement.close();
           // resultSet.close();
          //  resultSet2.close();
        }

    }


}
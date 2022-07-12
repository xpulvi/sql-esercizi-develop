package sqlL4;

import com.github.xpulvi.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Alter {
    public static void main(String[] args) {
        // db parameters
        String url       = "jdbc:mysql://localhost:3306/newdb";
        String user      = "developer";
        String password  = "test";

        try (Connection conn = DriverManager.getConnection(url, user, password)){

            // generte student obj
            Student marco = new Student("Italy","Marco","giogio");
            Student andrea = new Student("Italy","Andrea","totoro");
            Student luca = new Student("Germany ","luca","pickar");
            Student filipo = new Student("Germany ","filipo","npstrano");

            Statement statement = conn.createStatement();
           // ResultSet resultSet = statement.execute("CREATE TABLE newdb.students " + " (  `country` VARCHAR(30) NOT NULL,  `last_name` VARCHAR(45) NULL, PRIMARY KEY (`country`))");
            statement.execute("ALTER TABLE `newdb`.`students` ADD COLUMN `country` VARCHAR(30)  AFTER `first_name`");


            List<Student> studentList = new ArrayList<>();
            studentList.add(marco);
            studentList.add(andrea);
            studentList.add(luca);
            studentList.add(filipo);


            //ciclo forHec
            for (Student o : studentList) {
                //System.out.println(statement.executeUpdate();
                statement.executeUpdate("INSERT INTO newdb.students (last_name, first_name, country) VALUES ('" + o.getLast_name() + "', '"+ o.getFirst_name() + "', '" + o.getCountry()+"')");
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {

        }
    }

}

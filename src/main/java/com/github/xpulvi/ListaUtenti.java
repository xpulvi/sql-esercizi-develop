package com.github.xpulvi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListaUtenti {


        public static void main(String[] args) {



            // db parameters
            String url       = "jdbc:mysql://localhost:3306/newdb";
            String user      = "developer";
            String password  = "test";

            try (Connection conn = DriverManager.getConnection(url, user, password)){



                Statement statement = conn.createStatement();

                //generazione del utente
                Utente luca = new Utente("luigi","gigi");
                Utente marzio = new Utente("marzio","salvi");
                Utente bruno = new Utente("bruno","ravasio");
                Utente marco = new Utente("marco","locateli");
                //creazione della lista
                List<Utente> utenteList = new ArrayList<Utente>() {};
                //agiunta del ogeto persona
                utenteList.add(luca);
                utenteList.add(marzio);
                utenteList.add(bruno);
                utenteList.add(marco);


                //ciclo forHec
                for (Utente o : utenteList) {
                    //  statement.executeQuery('CREATE USER' + o + 'viewer@localhost' 'IDENTIFIED BY passwordhere');
                    statement.executeUpdate("INSERT INTO newdb.students (last_name, first_name) VALUES ('" + o.getName() + "', '"+ o.getSurname() + "')");
                }
            } catch(SQLException e) {
                System.out.println(e.getMessage());
            } finally {


            }
        }
    }


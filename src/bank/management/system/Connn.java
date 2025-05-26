package bank.management.system;

import java.sql.*;

public class Connn {

     Connection connection;
     Statement statement;

    public Connn() {
        try {

            // Connect to database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Praveen@2004");
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

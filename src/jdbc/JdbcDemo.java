package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java6April","root3","password");

            System.out.println(connection.isValid(1000));

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver

            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/java6April","root3","password");

            Statement statement = connection.createStatement();
            String insert = "insert into student(id,name,address) values(2,'Rahul','Mumbai')";

            int i = statement.executeUpdate(insert);
            System.out.println("record inserted "+i);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

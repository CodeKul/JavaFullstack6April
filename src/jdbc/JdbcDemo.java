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

//            String update  = "update student set name='ramesh' where id= 1";
//
//            String delete = "delete from student where id = 1";
            int i = statement.executeUpdate(insert);
            System.out.println("record deleted "+i);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

//codekul.vaibhav@gmail.com
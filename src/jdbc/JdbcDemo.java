package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {

        try {

            Statement statement = JdbcConfig.getConn().createStatement();
            String insert = "insert into student(id,name,address) values(2,'Rahul','Mumbai')";

//            String update  = "update student set name='ramesh' where id= 1";
//
//            String delete = "delete from student where id = 1";
            int i = statement.executeUpdate(insert);
            System.out.println("record deleted "+i);


        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

//codekul.vaibhav@gmail.com
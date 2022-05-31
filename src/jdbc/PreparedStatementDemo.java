package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver

            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/java6April","root3","password");

            int id;
            String name;
            String address;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter value for id");
            id = scanner.nextInt();
            System.out.println("Enter value for name");
            name = scanner.next();
            System.out.println("Enter value for address");
            address = scanner.next();

            String insert = "insert into student(id,name,address) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);
            int i = preparedStatement.executeUpdate();

            System.out.println("record saved ="+i);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

/**
 *
 * //main root
 * CREATE USER 'new_user'@'localhost' IDENTIFIED BY 'new_password';
 * database creatation
 * GRANT ALL ON my_db.* TO 'new_user'@'localhost';
 * exit;
 *
 *  mysql -u root3 -p
 *
 *
 */
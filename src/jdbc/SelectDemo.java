package jdbc;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver

            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/java6April","root3","password");

            Statement statement = connection.createStatement();

            String select =  "select * from student";
            ResultSet rs =  statement.executeQuery(select);

            while (rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString(3));
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

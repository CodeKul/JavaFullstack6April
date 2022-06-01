package jdbc;

import java.sql.*;

public class CallableDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java6April","root3","password");

            CallableStatement callableStatement = connection.prepareCall("call getStudentData()");

            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }



    }
}

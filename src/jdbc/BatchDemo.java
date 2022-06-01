package jdbc;

import java.sql.*;

public class BatchDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java6April","root3","password");

            String insert  = "insert into student(id,name,address)values(?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insert);

            for(int i=3;i<=13;i++){
                preparedStatement.setInt(1,i);
                preparedStatement.setString(2,"name "+i);
                preparedStatement.setString(3,"address "+i);
                preparedStatement.addBatch();
            }

            int[]  count = preparedStatement.executeBatch();

            System.out.println("record saved "+ count.length);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

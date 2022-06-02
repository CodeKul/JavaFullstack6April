package jdbc;

import java.sql.*;

public class BatchDemo {
    public static void main(String[] args) {
        try {

            String insert  = "insert into student(id,name,address)values(?,?,?)";

            PreparedStatement preparedStatement = JdbcConfig.getConn().prepareStatement(insert);

            for(int i=3;i<=13;i++){
                preparedStatement.setInt(1,i);
                preparedStatement.setString(2,"name "+i);
                preparedStatement.setString(3,"address "+i);
                preparedStatement.addBatch();
            }

            int[]  count = preparedStatement.executeBatch();

            System.out.println("record saved "+ count.length);

        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

package jdbc;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try {
            Statement statement = JdbcConfig.getConn().createStatement();
            String select =  "select * from student";
            ResultSet rs =  statement.executeQuery(select);
            while (rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

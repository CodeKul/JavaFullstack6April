package jdbc;

import java.sql.*;

public class CallableDemo {
    public static void main(String[] args) {
        try {

            CallableStatement callableStatement = JdbcConfig.getConn().prepareCall("call getStudentData()");

            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }



    }
}

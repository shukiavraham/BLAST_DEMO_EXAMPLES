package sqlInjection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLI {
    public void sqlTest1(String ip) {
        try {
			String uuid = UUID.randomUUID().toString();
            Statement statement = getJDBCConnection().createStatement();
            String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + uuid + "','" + ip + "')";
            statement.execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    
    public void sqlTest2(int x,String d,String y) {
        try {
            int u=x+1;
            System.out.println( d+"blabla");
            String id = getid(y);
            String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + id + "')";
            Statement statement = getJDBCConnection().createStatement();
            statement.execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        System.out.print("sdfdsf");
    }

    public String getid(String x){
        String id = x;
        return id;
    }


    Connection getJDBCConnection() {
        return null;
    }
}

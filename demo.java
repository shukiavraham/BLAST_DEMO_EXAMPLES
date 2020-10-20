
package testing;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
public class Test {
	
	
	
	//One method with bouth sink and source	
	public   void sinkSource(Request req) {
		String ip = req.getParameter("ip");
        try  {
        	String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
        	getJDBCConnection().createStatement().execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
       System.out.print("sdfdsf");
    }
	
	//Inter 1 - following paramters to a source in a diffrent method
	public void source1(Request req){
		sink1(req.getParameter("ip"));
	}
	
	
	public   void sink1(String ip) {
        try  {
        	String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
        	getJDBCConnection().createStatement().execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
       System.out.print("sdfdsf");
    }
	
	
	
	
	
	
	
	
	//Inter 2 - following paramters to a source in a diffrent method
	public void source2(Request req){
		String ip = req.getParameter("ip"));
		String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
		sink2(getJDBCConnection().createStatement(), sql);
	}
	
	
	public   void sink2(Statement st, String sql) {
        try  {
		st.execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
       System.out.print("sdfdsf");
    }
	
	
	
	
	
	
	
	
	
	
	
	
	//Inter 2 - following paramters to a source in a diffrent method
	public void source2_1(Request req){
		String ip = req.getParameter("ip"));
		String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
		sink3(getJDBCConnection().createStatement(), sql);
	}
	
	public void source2_2(Request req){
		String blop = req.getParameter("blop"));
		String sql = "INSERT INTO banned_ip(id, blop) VALUE('" + UUID.randomUUID().toString() + "','" + blop + "')";
		sink3(getJDBCConnection().createStatement(), sql);
	}
	
	
	public   void sink3(Statement st, String sql) {
        try  {
		st.execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
       System.out.print("sdfdsf");
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void source4(Request req){
		String blop = req.getParameter("blop"));
		String sql1 = "INSERT INTO banned_ip(id, blop) VALUE('" + UUID.randomUUID().toString() + "','" + blop + "')";
		Statement st = getJDBCConnection().createStatement();
		sink4(st, sql1);
		st = getJDBCConnection().createStatement();
		String sql2 = "SELECT * from users";
		sink4(st, sql2);
	}
	
	
	public   void sink4(Statement st, String sql) {
        try  {
		st.execute(sql);
		st.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
       System.out.print("sdfdsf");
    }
	
	
	
	public void source5(Request req){
		String blop = req.getParameter("blop"));
		String sql1 = "INSERT INTO banned_ip(id, blop) VALUE('" + UUID.randomUUID().toString() + "','" + blop + "')";
		Statement st = getJDBCConnection().createStatement();
		sink4(st, sql1);
	}
	
	
	public   void sink5(Statement st, String sql) {
        try  {
		st.execute(sql);
		st.close();
		st = getJDBCConnection().createStatement();
		String sql2 = "SELECT * from users";
		st.execute(sql2);
		st.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
       System.out.print("sdfdsf");
    }
	
	
	
	
	
	
	
	public void do_staf(String id){
		return id;
	}
	
	
	public   void sink5(String id) {
        try  {
		String ip = do_staf(id);
		String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
        	getJDBCConnection().createStatement().execute(sql);
		
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
       System.out.print("sdfdsf");
    }
	
	
	
	
	
	
	
	//get from source
	public void do_more_staf(String id){
		return id+System.getProperty("prop");
	}
	
	
	public   void sink6(String id) {
        try  {
		String ip = do_more_staf(id);
		String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
        	getJDBCConnection().createStatement().execute(sql);
		
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
       System.out.print("sdfdsf");
    }
	
	
	
	Connection getJDBCConnection() {
		return null;
	}
}

package tools;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	private static Connection conn;
	public static Connection getConn(){
		if(conn!=null){
			return conn;
		}else{
			//加载驱动类
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			//创建连接
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String username = "SCOTT";
			String pass = "TIGER";
			try {
				conn = DriverManager.getConnection(url, username, pass);
				System.out.println("连接数据库成功");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return conn;
	}
	
	public static void close(ResultSet rs,PreparedStatement ps,Connection con){
		try {
			if(rs!=null){
				rs.close();
			}
			if(ps!=null){
				ps.close();
			}
			if(con!=null){
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    public static void close(ResultSet rs,Statement stmt,Connection con){
    	try {
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(con!=null){
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    public static void main(String[] args) {
		DbUtil.getConn();
	}

}


package com.xdyy.tools.dao;

import java.sql.*;


public class Dao {/*Data Access Object*/
	
	private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL="jdbc:sqlserver://192.168.7.232:1433;databaseName=YXHIS";
	private static final String USER="sa";
	private static final String PASSWORD="321";
	
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private void preWork(String sql,Object... params) throws SQLException{
		StringBuilder builder=new StringBuilder("{");
		if(params!=null){
			for(int i=0;i<params.length;i++){
				if(i==0)builder.append("["+params[i]+"]");
				else builder.append(",["+params[i]+"]");
			}
		}
		builder.append("}");
		System.out.println("------sql-start------");
		System.out.println("SQL:"+sql);
		System.out.println("PARAMS:"+builder.toString());
		System.out.println("------sql-end------");
		
		conn=DriverManager.getConnection(URL,USER,PASSWORD);
		
		pstmt=conn.prepareStatement(sql);
		
		if(params!=null){
			for(int i=0;i<params.length;i++){
				if(params[i] instanceof java.util.Date ){
					java.util.Date d=(java.util.Date) params[i];
					java.sql.Timestamp t=new java.sql.Timestamp(d.getTime());
					pstmt.setTimestamp(i+1, t);
					
				}else{
					pstmt.setObject(i+1, params[i]);
				}
			}
		}
		
	}
	
	public ResultSet query(String sql,Object... params) throws SQLException{
	
		try {
			this.preWork(sql, params);
			rs=pstmt.executeQuery();
			
			return rs;
		} catch (SQLException e) {			
			e.printStackTrace();
			this.close();
			throw e;
			
		} 
		
		
	}
	
	public int update(String sql,Object... params) throws SQLException{
		
		try {
			this.preWork(sql, params);
			return pstmt.executeUpdate();
			
		} finally{
			this.close();
		}
		
	}
	
	/**
	 * �ر���Դ
	 */
	public void close(){
		
		try {
			if(rs!=null)
				rs.close();
		} catch (Exception e) {}
		rs=null;
			
		try {
			if(pstmt!=null)
				pstmt.close();
		} catch (Exception e) {}
		pstmt=null;
			
		try {
			if(conn!=null&&!conn.isClosed())
				conn.close();
		} catch (Exception e) {}
		conn=null;
		
		
	}
	
}

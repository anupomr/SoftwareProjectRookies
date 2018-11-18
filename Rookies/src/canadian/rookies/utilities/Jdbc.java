package canadian.rookies.utilities;

import java.sql.*;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Jdbc {
	
//	private static String JDBC_URL = "jdbc:mysql://localhost:3306/rookies";
//	private static String USER = "user";
//	private static String PASSWORD = "password";
	
	/**
	 * Connection
	 */
	public Connection getConnection() {
		Connection conn = null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
			
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/RookiesDS");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return conn;
	}
	
	public void closeConnection(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Statement
	 */
	public Statement getStatement(Connection conn, boolean defaultCursor) {
		Statement s = null;
		try {
			if(defaultCursor) {
				s = conn.createStatement();
			} else {
				s = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public Statement getStatement(Connection conn) {
		Statement s = null;
		try {
			s = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return s;
	}
	
	public void closeStatement(Statement s) {
		try {
			if(s != null) {
				s.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ResultSet
	 */
	public ResultSet getResultSet(Statement s, String sql) {
		ResultSet rs = null;
		try {
			rs = s.executeQuery(sql); // executeSQL select
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public int executeSQL(Statement s, String sql) {
		int r = 0;
		try {
			s.executeUpdate(sql); // executeSQL insert, update, delete
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
	
	public void closeResultSet(ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

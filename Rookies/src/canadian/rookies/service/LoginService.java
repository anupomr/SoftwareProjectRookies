package canadian.rookies.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import canadian.rookies.model.Login;
import canadian.rookies.utilities.Jdbc;

public class LoginService {

	private Jdbc jdbc;
	private Connection conn;
	private Statement s;
	private ResultSet rs;

//	synchronized public static LoginService getInstance() {
//		if(loginService == null) {
//			loginService = new LoginService();
//		}
//		return loginService;
//	}
//	public LoginService() {
//		jdbc = new Jdbc();
//		conn = jdbc.getConnection();
//		s = jdbc.getStatement(conn);
//	}
	@SuppressWarnings("finally")
	public List<Login> getLogin() throws Exception {
		jdbc = new Jdbc();
		conn = jdbc.getConnection();
		s = jdbc.getStatement(conn);
		List<Login> list = new ArrayList();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from UserLogin");

		try {
			rs = jdbc.getResultSet(s, sql.toString());
			while (rs.next()) {
				Login login = new Login();
				login.setUserName(rs.getString("UserName"));
				login.setPassword(rs.getString("UserPassword"));
				list.add(login);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbc.closeResultSet(rs);
			jdbc.closeStatement(s);
			jdbc.closeConnection(conn);
			return list;
		}
	}

	public void saveNewUser(String uN, String pass, String type) throws Exception {
		jdbc = new Jdbc();
		conn = jdbc.getConnection();
		s = jdbc.getStatement(conn);
		StringBuffer sql = new StringBuffer();		
		sql.append("insert INTO UserLogin VALUES ('"+uN+"','"+pass+"','"+type+"')");

		try {
			jdbc.executeSQL(s, sql.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbc.closeResultSet(rs);
			jdbc.closeStatement(s);
			jdbc.closeConnection(conn);

		}
	}
	public void registration(String userName,String firstName, String lastName, String address,String postalCode, String state, String city, int phNum,String email) 
			throws Exception {
		jdbc = new Jdbc();
		conn = jdbc.getConnection();
		s = jdbc.getStatement(conn);
		StringBuffer sql = new StringBuffer();		
		sql.append("insert INTO UserDetails(UserName,FirstName,LastName,FullAddress,PostalCode,State,City,PhonNumber,Email) "
				+ "VALUES ('"+userName+"','"+firstName+"','"+lastName+"','"+address+"','"+postalCode+"','"+state+"','"+city+"',"+phNum+",'"+email+"')");

		try {
			jdbc.executeSQL(s, sql.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbc.closeResultSet(rs);
			jdbc.closeStatement(s);
			jdbc.closeConnection(conn);

		}
	}
	@SuppressWarnings("finally")
	public String passwordRecovery(String userName) throws Exception {
		jdbc = new Jdbc();
		conn = jdbc.getConnection();
		s = jdbc.getStatement(conn);
		String list = "";
		StringBuffer sql = new StringBuffer();
		sql.append("select * from UserLogin where UserName='"+userName+"'");

		try {
			rs = jdbc.getResultSet(s, sql.toString());
			while (rs.next()) {
				
				list=rs.getString("UserPassword");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbc.closeResultSet(rs);
			jdbc.closeStatement(s);
			jdbc.closeConnection(conn);
			return list;
		}
	}

}

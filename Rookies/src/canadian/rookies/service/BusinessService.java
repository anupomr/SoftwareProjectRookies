package canadian.rookies.service;

import java.util.ArrayList;
import java.util.List;

import canadian.rookies.model.BusinessCategory;
import canadian.rookies.utilities.Jdbc;
import java.sql.*;

public class BusinessService {
	private static BusinessService businessService = null;
	
	private Jdbc jdbc;
	private Connection conn;
	private Statement s;
	private ResultSet rs;

//	synchronized public static BusinessService getInstance() {
//		if(businessService == null) {
//			businessService = new BusinessService();
//		}
//		return businessService;
//	}
//	
//	private BusinessService() {
//		jdbc = new Jdbc();
//		conn = jdbc.getConnection();
//		s = jdbc.getStatement(conn);
//	}
	
	@SuppressWarnings("finally")
	public List<BusinessCategory> getBusinessCategory() throws Exception {
		
		jdbc = new Jdbc();
		conn = jdbc.getConnection();
		s = jdbc.getStatement(conn);
		
		List<BusinessCategory> list = new ArrayList();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from ROOKIES.BusinessCategory");
		
		try {
			rs = jdbc.getResultSet(s, sql.toString());
			while(rs.next()) {
				BusinessCategory bc = new BusinessCategory();
				bc.setBcpk(Integer.parseInt(rs.getString("BCPK")));
				bc.setCategory(rs.getString("Category"));
				list.add(bc);
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

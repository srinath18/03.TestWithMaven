package com.fanniemae.payroll.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public abstract class AbstractSQLDAO {

	public void process(String sqlStatement) {

		BasicDataSource ds = new BasicDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("hexaware");
		ds.setUrl("jdbc:mysql://localhost:3306/world?useSSL=false");

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			con = ds.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlStatement);
			while (rs.next()) {
				results(rs);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	protected abstract void results(ResultSet rs) throws SQLException;

}
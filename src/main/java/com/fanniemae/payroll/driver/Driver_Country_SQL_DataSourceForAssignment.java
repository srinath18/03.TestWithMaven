package com.fanniemae.payroll.driver;


	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;


		public class Driver_Country_SQL_DataSourceForAssignment {

		public static void main(String[] args) {

			BasicDataSource ds = new BasicDataSource();

			ds.setDriverClassName("com.mysql.jdbc.Driver");
			ds.setUsername("root");
			ds.setPassword("hexaware");
			ds.setUrl("jdbc:mysql://localhost:3306/world");

			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			try {
				con = ds.getConnection();
				stmt = con.createStatement();
				rs = stmt.executeQuery("select code, name, population from country");
				while (rs.next()) {
					System.out.println("code=" + rs.getString("code") 
					+ "name=" + rs.getString("name") 
					+ "population="  + rs.getInt ("population"));
					
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

	}


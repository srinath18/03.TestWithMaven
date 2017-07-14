package com.fanniemae.payroll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fanniemae.payroll.model.City;

public class CityRepository extends AbstractSQLDAO 
	implements IQuery <City> {
	
	ArrayList<City> list = new ArrayList<>();
	
	@Override
	protected void results(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		
		int id = rs.getInt("id");
		String name = rs.getString("name");
		int population = rs.getInt("population");
		list.add(new City(id, name, population));
		
	}

@Override
	public City findByKey(String key) {
		// TODO Auto-generated method stub
	String sql = "select Id, name, population from city " + " where id =" + key;
	super.process(sql);
	City city = list.get(0);
	return city;
	}

@Override
public ArrayList<City> findAll() {
	// TODO Auto-generated method stub
	
	String sql = "select Id, name, population " + " from city ";
	super.process(sql);
	City city = list.get(0);
	
	return list;
}
}

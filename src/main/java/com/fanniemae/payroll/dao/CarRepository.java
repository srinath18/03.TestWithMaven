package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarRepository implements IQuery<String> {

	@Override
	public ArrayList<String> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Double> findMaps() {
	Map<String, Double> carMap = new HashMap<>();
	
	carMap.put("Lexus", 50_000d);
	carMap.put("RangeRover",  100_000d);
	carMap.put("BMW",  90_000d);
	carMap.put("Honda",  30_000d);
	carMap.put("LandRover",  50_000d);
	carMap.put("Volkswagen",  50_000d);
	carMap.put("Fiat",  50_000d);
	carMap.put("Ford",  50_000d);
	
		return carMap;
		
	}

	
}

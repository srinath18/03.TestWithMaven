package com.fanniemae.payroll.driver;

import java.util.HashMap;
import java.util.Set;

public class DriverMap {
	/* comments comments something to heck
	  my name is Sreenath Subrahmanyam */

	public static void main(String[] args) {
		HashMap<String, Double> map = new HashMap<>();
				
		map.put("david", 1_000_000d);
		map.put("lucy", 2_000_000d);
		map.put("peter", 3_000_000d);
		
		System.out.println (map.get("robert"));
		System.out.println(map.size());
		
		Set<String> keys = map.keySet();
		for (String string : keys) {
			System.out.println(string.toUpperCase());
			
		}
		

	}

}

package com.fanniemae.payroll.dao;

import java.util.ArrayList;

public class ShoppingRepository implements IQuery {

	@Override
	public ArrayList<String> findAll() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Oranges, 10");
		list.add("Apples, 5");
		list.add("Bread, 10");
		list.add("Water, 2");
		list.add("Chips, 2");
		
		return list;
	}

}

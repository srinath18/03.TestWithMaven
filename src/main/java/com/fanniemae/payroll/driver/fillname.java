package com.fanniemae.payroll.driver;

import java.util.HashSet;
import java.util.Set;

import com.fanniemae.payroll.model.EmployeeType;

public class fillname{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set= new HashSet<>();
		set.add("NY");
		set.add ("CT");
		set.add ("VA");
		set.add ("FL");
		
		set.add ("NY");
		
		System.out.println(set.size());

		Set<EmployeeType> emps = new HashSet <>();
		
		emps.add(new EmployeeType ("X", 1000, 2));
		emps.add(new EmployeeType ("X", 1000, 2));
		emps.add(new EmployeeType ("X", 1000, 2));
		
		System.out.println(emps.size());
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}

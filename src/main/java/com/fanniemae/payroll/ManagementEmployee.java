package com.fanniemae.payroll;

public class ManagementEmployee extends Employee {

	float hoursWorked = 40f;

	public ManagementEmployee(float yearlySalary) {
		super(yearlySalary);
		// TO DO Auto-generated
	}

	public ManagementEmployee(float yearlySalary, float hw) {
		super(yearlySalary);
		this.hoursWorked = hw;

	}

	@Override
	public float getOverTimeHourlyWage() {
		float otWage = 0f;
		if (hoursWorked >= 50 && hoursWorked < 60) {
			otWage = 1000 / (hoursWorked - 40);
		} else if (hoursWorked >= 60 && hoursWorked < 80) {
			otWage = 2000 / (hoursWorked - 40);
		} else if (hoursWorked >= 80) {
			otWage = 4000 / (hoursWorked - 40);
		}
		return otWage;
	}

	@Override
	public float getWeeklySalary() {
		float otSalary = super.getWeeklySalary();
		
		if(hoursWorked>=50&&hoursWorked<60){
			otSalary = super.getWeeklySalary()+1000;
		}
		
		else if(hoursWorked>=60&&hoursWorked<80){
			otSalary = super.getWeeklySalary()+2000;
		}
		
		else if(hoursWorked>80){
			otSalary = super.getWeeklySalary()+4000;
		}
		
		return otSalary;
		
	}
}



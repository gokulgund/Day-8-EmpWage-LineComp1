package com.bl.empwagecomputation;

public class EmpWageUC2 {
	public static void main(String[] args) {
		dailyEmpWage();
	}

	public static void dailyEmpWage() {
		int IS_PRESENT = 1;
		int SALARY_PERHR = 20;
		double empCheck = Math.floor((Math.random() * 10) % 2);
		int Working_Hr = 0;
		if (empCheck == IS_PRESENT) {
			Working_Hr = 8;
		}
		double Salary = Working_Hr * SALARY_PERHR;
		System.out.println("Emplyee Salary is = " + Salary + "  Doller");
	}
}

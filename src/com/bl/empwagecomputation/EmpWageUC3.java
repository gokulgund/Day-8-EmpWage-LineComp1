package com.bl.empwagecomputation;

public class EmpWageUC3 {
	public static int IS_PRESENT = 1;
	public static int SALARY_PERHR = 20;
	public static int PART_TIME = 2;

	public static void main(String[] args) {
		partTime();
	}

	public static void partTime() {

		double empCheck = Math.floor((Math.random() * 10) % 3);
		int Working_Hr = 0;
		if (empCheck == IS_PRESENT) {
			Working_Hr = 8;
		} else if (empCheck == PART_TIME) {
			Working_Hr = 4;
		} else {
			Working_Hr = 0;
		}
		double Salary = Working_Hr * SALARY_PERHR;
		System.out.println("Emplyee Salary is = " + Salary + "  Doller");
	}
}

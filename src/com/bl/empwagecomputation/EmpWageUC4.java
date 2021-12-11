package com.bl.empwagecomputation;

public class EmpWageUC4 {
	public static final int IS_FULL_TIME = 1;
	public static final int SALARY_PERHR = 20;
	public static final int IS_PART_TIME = 2;

	public static void main(String[] args) {
		 usingSwitchCase();
	}

	public static void usingSwitchCase() {
		int empCheck = (int) Math.floor((Math.random() * 10) % 3);
		int Working_Hr = 0;
		switch (empCheck) {
		case IS_FULL_TIME:
			Working_Hr = 8;
			break;
		case IS_PART_TIME:
			Working_Hr = 4;
			break;
		default:
			Working_Hr = 0;
		}
		double Salary = Working_Hr * SALARY_PERHR;
		System.out.println("Emplyee Salary is = " + Salary + "  Doller");
	}

}

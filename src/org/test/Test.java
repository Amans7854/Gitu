package org.test;

public class Test {
	public void empDetails() {
		System.out.println("this is emp Details");

	}
	public void empDetails(int empID,int rollNum) {
		System.out.println("emp Id is "+ empID);
		System.out.println("emp Roll Num is"+rollNum);
	
		} 
	public void empDetails(int age,String name ) {
		System.out.println("emp age is  "+ age);
		System.out.println("emp Name is"+name);
	
		} 
	public void empDetails(float salary,long phno) {
		System.out.println("emp salary is  "+ salary);
		System.out.println("emp phno is "+phno);
	
		} 
	
	public void empDetails(long phno,float salary ) {
		System.out.println("emp phno is  "+ phno);
		System.out.println("emp salary is "+salary);
	
		} 
	public static void main(String[] args) {
		Test n = new Test();
		n.empDetails();
		n.empDetails(3452,1234);
		n.empDetails(30, "Narayanan");
		n.empDetails(50000.555f, 7585855995l);
		n.empDetails(6754321234l,70000.675f);
	
	}
	
}

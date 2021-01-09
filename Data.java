import java.util.Scanner;

abstract class Employee{
	String name;
	float sal, grosssal;

	Employee(String name,float sal){
		this.name = name;
		this.sal = sal;
	}
	void mprint(){
		System.out.println("Name : "+name);
		System.out.println("Basic Salary : "+sal+ " INR");
	}
	abstract float calculate_gross_salary();
	abstract void annual_increment(float inc);
}

class Manager extends Employee{
	float Hra;
	Manager(String s, float x, float h){
		super(s,x);
		Hra = h;
	}
	float calculate_gross_salary(){
		grosssal = sal + Hra;
		return grosssal;
	}
	void annual_increment(float val){
		System.out.println("Annual Increament Rewarded is: "+val+ " INR");
		float annual = grosssal*12 + val;
		System.out.println("Annual salary is "+annual+ " INR");
	}
}

class SalesManager extends Manager{
	float commission;
	SalesManager(String s, float x, float h, float comm){
		super(s, x, h);
		commission = comm;
	}
	float calculate_gross_salary(){
		grosssal = sal + Hra + commission;
		return grosssal;
	}
}

public class Data{
	public static void main(String[] args) 
	{
		Manager m = new Manager("Kapil Bansal",600000,150000);
		m.mprint();
		System.out.println("Gross salary of Manager is "+m.calculate_gross_salary());
		m.annual_increment(15000);
		
		System.out.println("\n");
		
		SalesManager sm = new SalesManager("Rex", 70000, 10000, 14000);
		sm.mprint();
		System.out.println("Gross salary of SalesManager is "+sm.calculate_gross_salary());
		sm.annual_increment(17000);
	}
}
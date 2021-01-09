/* Program-6: Write a program show the use of Interfaces (show multiple inheritance as shown in fig)*/

import java.util.Scanner;

interface I1{
	public void f1();
}

interface I2{
	public void f2();
}

interface I3 extends I1, I2{
	public void f3();
}

abstract class Employee{
	String name;
	float Sal;

	void calsal(){
		System.out.println("Salary is: "+Sal+" INR");
	}	
	abstract void increment();
}

class Emp extends Employee implements I3{
	float HRA;
	float Increment;
	float Annual;
	
	public void f1(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the Name of Employee:: ");
		name = sc.nextLine();
	}
	public void f2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the Basic salary of Employee:: ");
		Sal = sc.nextFloat();
	}
	public void f3(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the HRA of Employee:: ");
		HRA = sc.nextFloat();
	}
	void increment(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the Increment Rewarded:: ");
		Increment = sc.nextFloat();
	}
	void calsal(){
		float Annual = (Sal + HRA)*12 + Increment ;
		System.out.println("\n Annual salary  of "+name+" is "+Annual+ " INR");
	}
}

public class Interfaces
{	
	public static void main(String[] args) 
	{
		Emp e = new Emp();
		e.f1();
		e.f2();
		e.f3();
		e.increment();
		e.calsal();	
	}
}
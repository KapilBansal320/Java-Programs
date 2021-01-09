//ASSIGNMENT-5 PROGRAM-3: 

import java.util.Scanner;

class Bank
{
	private float bal;
	
	public Bank(float bal)
	{
		this.bal = bal;
	}
	public boolean isSufficientBalance(float w)
	{
		if(bal >= w)
			return true;
		else
			return false;
	}
	public void withdraw(float amt)
	{
		bal= bal-amt;
		System.out.println("Withdrawl money is: " + amt);
		System.out.println("Your current balance is: " + bal);
	}
}

class Customer extends Thread
{
	private Bank account;
	private String name;
	public Customer(Bank account, String name)
	{
		this.account = account;
		this.name = name;
	}
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		synchronized(account)
		{
			System.out.println(name +", Enter the amount to withdraw:: ");
			float amt = sc.nextFloat();
			
			if(account.isSufficientBalance(amt))
			{
				System.out.println("\nAccount Holder: "+ name);
				account.withdraw(amt);
			}
			else
				System.out.println("Insufficient Balance!!");
		}
	}
}

public class MultipleThread
{
	public static void main(String args[])
	{
		Bank a1 = new Bank(10000);
		Customer c1 =  new Customer(a1, "Ram");
		Customer c2 = new Customer(a1, "Shyam");
		c1.start();
		c2.start();
	}
}

//ASSIGNMENT-5:: PROGRAM-4: 

import java.util.*;

class MyThread implements Runnable {
	String name;
    MyThread (String threadname){
		name = threadname; 
		System.out.println("New thread: "+ name);
	}

	public void run() {
		try{
			for(int i = 5; i > 1; i--){
				System.out.println(name + ": " + i);
				Thread.sleep(100);
			}
		}
		catch (InterruptedException e){
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
 
public class RunnableInterfaces 
{
	public static void main(String args[]) 
	{
		
		Thread t3 = new Thread(new MyThread("Thread- Three"));
		Thread t1 = new Thread(new MyThread("Thread- One"));
		Thread t2 = new Thread(new MyThread("Thread- Two"));
		t3.start();
		t1.start();
		t2.start();
		System.out.println("Main thread exiting.");
	}
}

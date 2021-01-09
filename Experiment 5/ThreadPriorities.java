//ASSIGNMENT-5 PROGRAM-5:

public class ThreadPriorities extends Thread 
{
	String name;
	
	ThreadPriorities(String name){
		this.setName(name);
	}
	public void run(){
		System.out.println("Inside run method of "+this.getName());
	}

	public static void main(String[] args){
		ThreadPriorities T1 = new ThreadPriorities("T1");
		ThreadPriorities T2 = new ThreadPriorities("T2");
		ThreadPriorities T3 = new ThreadPriorities("T3");
		
		System.out.println("T1 priority : "+ T1.getPriority());
		System.out.println("T2 priority : "+ T2.getPriority()); 
		System.out.println("T3 priority : "+ T3.getPriority());

		System.out.println("\nAltering the default thread priorities: ");
		T1.setPriority(8);
		T2.setPriority(6);
		T3.setPriority(10);
		
		System.out.println("T1 thread priority : "+ T1.getPriority());
		System.out.println("T2 thread priority : "+ T2.getPriority());
		System.out.println("T3 thread priority : "+ T3.getPriority()); 
		
		System.out.println("\nEffect of Altering the thread priorities: ");
		T1.start();
		T2.start();
		T3.start();
		System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
	
		System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
	}
}

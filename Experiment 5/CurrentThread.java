//ASSIGNMENT-5:: PROGRAM-2: 

import java.util.*;

class Details implements Runnable{
  public void run() {
    System.out.println(Thread.currentThread().getId()+" "+Thread.currentThread().getName());                       
  }
}

public class CurrentThread{
  public static void main(String[] args){
    Thread t1 = new Thread(new Details(), "T1");
    Thread t2 = new Thread(new Details());
	
    t2.setName("Thread3");
    t1.start();
    t2.start();
  }
}

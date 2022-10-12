package MulitiThreading;
//Creating Thread using the Thread class

public class CreatingThread1 extends Thread
{
 public void run() // here we overridden the run() from Thread Class
 {
	 System.out.println("Task One Assignment area :");
	 
 }
	
	
public static void main(String [] args)  
   {
	CreatingThread1 Th = new CreatingThread1();
	Th.start();
	//CreatingThread1 Th2 = new CreatingThread1();
	//Th2.start();
	
	// Creating another thread in same class is performing same task with multiple threads
	
	//Th.run();
	//If we call directly run method then thread will not be created .
	//Start() method present in thread class . which contains code to function the run() method
   }
}


/*
 *Multi_threading : It is the process in Java is a process of executing multiple threads simultaneously.*/

 /****************************____Two ways OF creating Thread_____*************************************/
 /* 1. Using Thread Class
  * 2. Using Runnable Interface */

/*****************************___________ Advantages ____________*************************************/
/*
 * 1.It doesn't block the user because threads are independent and you can perform 
 *   multiple operations at the same time.
 * 2.You can perform many operations together, so it saves time.
 * 3.Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.*/
  
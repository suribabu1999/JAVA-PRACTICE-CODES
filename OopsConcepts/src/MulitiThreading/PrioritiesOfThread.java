package MulitiThreading;

public class PrioritiesOfThread extends Thread {
	
	
	public void run() {
		System.out.println("Task Assignment area :");
		System.out.println("Child Thread Priority "+Thread.currentThread().getPriority());//by default its priority is same as main thread.
	}
	public static void main(String[] args) {
		
		System.out.println("Main Thread Priority "+Thread.currentThread().getPriority());
		PrioritiesOfThread th = new PrioritiesOfThread();
		th.start();
		th.setPriority(MAX_PRIORITY);
	}

}
/*
 *!1.JVM Provides priorities to each Thread and according to 
 *the priorities JVM allocates Processors to the Threads 
 *
 *2.Priorities are represented in the form of integer values and it ranges from 1 to 10
 *     --MIN_PRIORITY=> 1
 *     --NORM_PRIORITY=>5
 *     --MAX_PRIORITY=>10*/
/***********************************____METHODS()____*********************************************/
 /*---> public final void setPriority(int n)
  *---> public final int getPRiority() */
  
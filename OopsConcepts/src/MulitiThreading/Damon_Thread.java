package MulitiThreading;

public class Damon_Thread extends Thread{
	
	public void run() {
		System.out.println("This Thread is a damon ");
		System.out.println("IS This Thread is Damon :"+currentThread().isDaemon());
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main Thread");
		Damon_Thread th = new Damon_Thread();
		th.setDaemon(true);
		th.start();
		
	}
}
/*Daemon Thread : It is a thread which always run in a background 
 *2.it always provide service to the thread. */
 /*********************************Two Methods****************************************/
/*1. public final void setDaemon(Boolean b)
 *2. public final boolean isDaemon() */
 
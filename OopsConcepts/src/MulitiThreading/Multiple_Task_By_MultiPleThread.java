package MulitiThreading;

public class Multiple_Task_By_MultiPleThread extends Thread{
	
	
	public void run() {
		System.out.println("**************Multiple Task From Multiple Threads******************");
		System.out.println("Five Different Threads were created to perform Five Different Task");
	}
	public static void main(String[] args) {
		Multiple_Task_By_MultiPleThread t1 = new Multiple_Task_By_MultiPleThread();
	    t1.start();
	    Music t2 = new Music();
	    t2.start();
	    Dancing t3 = new Dancing();
	    t3.start();
	    Eating t4 = new Eating();
	    t4.start();
		Rap t5 = new Rap();
		t5.start();
	}

}
class Music extends Thread{

	public void run() {
		System.out.println("Playing....");
	}
	
}
class Rap extends Thread{

	public void run() {
		System.out.println("Rapping.....");
	}

}
class Eating extends Thread{

	public void run() {
		System.out.println("Eating.....");
	}

}
class Dancing extends Thread{

	public void run() {
		System.out.println("Dancing.....");
	}

	
}
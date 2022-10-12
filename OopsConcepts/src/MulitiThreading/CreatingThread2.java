package MulitiThreading;
//Creating Thread using the runnable interface 

public class CreatingThread2 implements Runnable{
	
	public void run() {
		
		System.out.println("Task One Assignment Area :");
		
	}
	public static void main(String[] args) {
		
		
		CreatingThread2 th =new CreatingThread2();
				
		Thread t1 = new Thread(th);//Passing Instance of present Class as argument in Thread Constructor 
		                           //Which Contains Runnable as Arguments
		t1.start();               
		
		
	}

}

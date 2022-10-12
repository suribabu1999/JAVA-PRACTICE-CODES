package MulitiThreading;

public class Naming_method_ThreadClass extends Thread {
	public void run() {
		System.out.println("Thread Name After Changing  :"+currentThread().getName());
		
	}

	public static void main(String[] args) {
		System.out.println("Name of Cureent is "+currentThread().getName());//main is also a Thread . we can also change main thread name 
		currentThread().setName("MainMainMain");
		Naming_method_ThreadClass th = new Naming_method_ThreadClass();
		th.setName("SuriBabu");
		th.start();
		System.out.println("Main Thread name :"+currentThread().getName());
		System.out.println("Status of the Current Thread :"+currentThread().isAlive());
	}
}
/*********************___Two Methods for Naming thread in Thread Class***********************/
/*1.----- setName(String name)
 *2.----- getName() */

/*To get Current Thread Instance we use method called ----currentThread()*/
/*To know the status of the thread weather it in dead state or  alive we use 
 *Method called                                       -----isAlive()
 *which give output as  ' true ' or false*/
 
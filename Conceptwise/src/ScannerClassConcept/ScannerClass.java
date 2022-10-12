package ScannerClassConcept;

import java.util.Scanner;

public class ScannerClass {
	
	void meth1()
	{
		
	}
	void meth2(int age)
	{
		
		System.out.println("User entered age ==>"+age);
		System.out.println("------------------------------");
		if(age>=18)
		System.out.println(" you are a major :");
		else
			System.out.println("You are a minor");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter Age :");
		ScannerClass obj1=new ScannerClass(); //scanner class object
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt(); // next int method which returns the int value given by user
		obj1.meth2(i);
		sc.close();
		
	}
	
	

}
/*Scanner class is generally used to take dynamic inputs from user in runtime
 * it is available in java.util package
 * scanner class introduced in java1.5 version
 * if we want to use scanner class we need to create a object of the scanner clsass
 **/

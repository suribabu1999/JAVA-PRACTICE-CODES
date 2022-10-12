package BasicConcepts;



import java.util.Scanner;

public class Test{
	    
	int a =23; //instance variables 

	public void Roshini() {
		int a =32;  //local variables 
		System.out.println(a);
//		System.out.println(this.a);
		System.out.println(this.a);
		
		
		
	}
	

	
	public static void main(String[] args) {
		
		
		Test obj = new Test();
		obj.Roshini();
		String str1 = "OMM Sairam";
		System.out.println(str1.length());
		System.out.println(str1.contains("OMM"));
		
		
		for(int i=0 ; i<=5 ; i++) {
			System.out.println(i);
		}
		
		
		
		
		
	}
}









/*
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("enter the String value "); String str = sc.nextLine();
 * System.out.println("The value of string---->"+str);
 * System.out.println("enter the int value "); int a = sc.nextInt();
 * System.out.println("The Entered Value "+a);
 */


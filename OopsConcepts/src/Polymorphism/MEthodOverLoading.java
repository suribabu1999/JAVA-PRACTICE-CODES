package Polymorphism;
import java.util.Scanner;

public class MEthodOverLoading {
	
	public void method(int a )// identified by single arguments
	{
		System.out.println("Value of a=====>"+a);
		System.out.println("-----------------------------------");
	}
    public void method() // identified by no arguments
    {
    	System.out.println("This Method Does not contain any arguments");
    	System.out.println("-----------------------------------");
    	
    }
    public void method(int b , String s) //identified by Two Different arguments
    {
    	System.out.println("Your name  ===> "+s);
    	System.out.println("Value of b ===>"+b);
    	System.out.println("-----------------------------------");
    	
    }
	public static void main(String[] args) {
		System.out.println("Enter the value of b :");
		MEthodOverLoading obj =  new MEthodOverLoading();
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		System.out.println("Enter your name :");
		String s =sc.next();
		obj.method(b, s);//method which contains Two sequence of arguments same name
		System.out.println("Enter the value of a :");
		obj.method(sc.nextInt());//Method which Contains only one arguments
		obj.method();//method Which does not contain arguments with same name
		MainMethodOverLoading obj2 = new MainMethodOverLoading();
		obj2.main(2);
		
	}
}
class MainMethodOverLoading{
	public static void main(int z) //Main method OverLoading 
	{
		System.out.println("MAin method is OverLoaded "+z);
	}
}

/* In this program We have Three methods with different argument list IN A SAME CLASS 
 * Compiler Will Handle the method overloading on Polymorphism
 * Compiler will find by identifying arguments manner to execute Particular Method needed.*/




/***************-Difference BEtween MEthod OveLoading and MethodOverLoding***************
 * 
 * Method OverLoading         |        Method Over riding 
 * ---------------------------------------------------------  
 * 1. same name methods        |   1. Same name of methods   |
 * 2. Same Class              |   2. Different Class        |
 * 3. Different Arguments     |   3. Same Arguments         |
 *    -No.of arguments        |      - No.of arguments      |
 *    -Sequence of arguments  |      - Sequence of arguments|
 *    -Type of arguments      |      - Type of arguments*///|
//-----------------------------------------------------------

/* ------------------Important Points----------------------------
 * 1. Method OverLoading is Not possible When Return type of the method is Different because of ambiguity 
 * 2. We Can OverLoad main Method
 * 3. Study Automatic Promotion suri*/

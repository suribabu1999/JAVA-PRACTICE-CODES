package IterationStatement;

public class IfLoop {
	void meth1(int a )
	{
		System.out.println("------meth()--------");
		
		if(a<=20) {
			System.out.println("count"+a+"= Hi");
			a++;
		}
		System.out.println("**Compiler came out of IF LOOp***");
	}
	public static void main(String[]args) {
		IfLoop obj = new IfLoop();
		obj.meth1(9);
		
	}
	
	
	
	

}





/*1. it will exicute if the condition is true .
 * */
 
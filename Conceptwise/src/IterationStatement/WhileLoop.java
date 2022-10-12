package IterationStatement;

public class WhileLoop {
	void meth1(int a) 
	{
        System.out.println("------meth()--------");
		
		while(a<=20)
		{
			
			System.out.println("count " +a+ "= Hi");
			a++;
		}
		
		System.out.println("**Compiler came out of while LOOp***");
		
	}
	void meth2(int a) {
		
		while (true)
		{
			
			System.out.println("----Hi-----");
			
	     }
	//	System.out.println("This instruction is unreachable remove comment and checjk it will give error ");
	// if u give 'false' in contion then it will exicute .
	}



	public static void main(String[] args) {
		
		WhileLoop obj = new WhileLoop();
		obj.meth1(1);
		obj.meth2(3);
		
	}

}

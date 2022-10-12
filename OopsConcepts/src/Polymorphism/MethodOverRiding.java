package Polymorphism;


class ABC {
	 
	public void Method()
	{
		System.out.println(" Method 2");
	}
	
	
}

public class MethodOverRiding  extends ABC{
	
	public void Method()
	{
		System.out.println("Method 1");
		
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverRiding obj =  new MethodOverRiding();
		 ABC obj1 = new ABC();
		 obj1.Method();
		 obj.Method();
		
	}

}
 
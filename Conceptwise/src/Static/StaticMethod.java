package Static;

//Access of static method is also in this program
public class StaticMethod {
	int a=9;
	static int b=9;

	static void meth1() {                                                    //static method is create by using the static keyword
		int a=10;                                                             //Local variable        
		System.out.println("======Method 1 is called=====");
		System.out.println("Loacal variable with same name as static variable====>"+a);
		System.out.println("Instance vareiable=====>"+new StaticMethod().a); /*we can only able call instance variable
		                                                                       by using Class instance(( ----new StaticMethod().a-----))*/
		System.out.println("Staic Variable==========>"+b);
		
	}
	
	
	public static void main (String[]args)
	{
		StaticMethod obj = new StaticMethod();
		obj.meth1();      //by creating an object and calling with reference to object 
		//StaticMethod.meth1();//  by class name 
		//meth1();  // Directly by using the method name
		
		
	}
	
}

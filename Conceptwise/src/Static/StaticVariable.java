package Static;

public class StaticVariable {
	
	
	
	int a=0;     //instance variable
	static int b=0;       // vale will be updated for every successful execution of constructor that is why the value of b is changing
	                      //static variable the will be ONECOPY ..and for instance variable the will be seperate Copy.
	void meth1()                                                        
	{
		a++;
		b++;
        System.out.println("=================>value of A =="+a);
        System.out.println("=================>value of B =="+b);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
	}
	StaticVariable(){
		
		
		a++;
		b++;
		  System.out.println("=================>value of A =="+a);
	      System.out.println("=================>value of B =="+b);
		
	}
	
	public static void main(String[]args) {
		StaticVariable obj = new StaticVariable();
		obj.meth1();
		new StaticVariable();
		new StaticVariable();
		new StaticVariable();
		new StaticVariable();
		new StaticVariable();
		new StaticVariable();
	}

}
/* in this program we can observe that in method 1 the values of both static variable and instance variable got increased 
 * in a constructor call the value of staic variable is not updating because it is static but in case vareble is instance varibale then the value is updating.
 * instance variable can be create in every method for  different value.
 * but static variable once created then value will be constant for whole programme */

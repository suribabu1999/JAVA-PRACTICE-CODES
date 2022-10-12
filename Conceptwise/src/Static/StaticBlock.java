package Static;

public class StaticBlock {
	final static int a;/*for final static variable we have give value to the variable or else it will give error Ohterwise
	                        initlize in static block (provide value directly)*/ 
	
	static
	{
		a=9;
		System.out.println("-----Static Block is Called ------");
		
	}
	public static void main(String []args) {
		System.out.println("----Main method is Called------");
	}
	static
	{
	
		System.out.println("-----Static Block 2 is Called ------");
		
	}
	
	
}


/*static block is block is created simply by using keyword static
 * 2. from static block and static method static block is having high priority 
 * 3. if we are creating more then one staic static block then by ORder is will get exicute
 * 4. for final static variable JVM will not provide any default values*/
 
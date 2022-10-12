package AutoBoxingAndUnboxing;

public class AutoUnboxing {
	
	void meth1() {
		
		System.out.println("****Auto Boxing****");
		int i=10; //Primitive DataType
	    Integer ival = Integer.valueOf(i);//AutoBoxing
		
	    
	    byte b=20;
	    Byte bval = Byte.valueOf(b); //autoBoxing
	    System.out.println("PDT===>"+i);//10
	    System.out.println("WCO===>"+ival);//10
	}
	
	
	public static void main(String[] args) {
		
		AutoUnboxing obj = new AutoUnboxing();
		obj.meth1();
	}

}

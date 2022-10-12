package AutoBoxingAndUnboxing;

import java.util.ArrayList;

public class AutoBoxing {
	void meth1()
	{
		System.out.println("**Auto Unboxing*****");
	    //converting a wrapper class object into a data type
		Integer ival = new Integer(10);
		int x = ival.intValue();//autoUnBoxing
		System.out.println("PDT===>"+x);
		System.out.println("WCO===>"+ival);
		System.out.println("************************************************");
		
		//converting wrapper class object into data type is known as autoUnboxing
		Byte bval = new Byte((byte)50);
		byte b= bval.byteValue();
		
		System.out.println("PDT===>"+b);
		System.out.println("WCO===>"+bval);
	}
	void meth2() {
		ArrayList al = new ArrayList();
		al.add(20);
		int i =20;
		al.add(i);
		Integer ival = new Integer(30);
		int a = ival.intValue();
		al.add(a);
		System.out.println(""+al);
	}
	
	
	
	
	
	public static void main(String[] args) {
		AutoBoxing obj = new AutoBoxing();
		obj.meth1();
		obj.meth2();
	}

}

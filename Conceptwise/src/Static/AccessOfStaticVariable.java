package Static;

public class AccessOfStaticVariable {
	
	static int a =9;
	
	void meth1() {
		int a=8;   //if we remove this the value of a will be eual to static variable
		System.out.println("Static Variable =========>"+a);                       // By variable Name
		System.out.println("Static Variable =========>"+AccessOfStaticVariable.a);   //By class name
		System.out.println("Static Variable =========>"+new AccessOfStaticVariable().a); // By Class object
	}
	public static void main(String[]args) {
		AccessOfStaticVariable aobj = new AccessOfStaticVariable();
		aobj.meth1();
	}

}
/* WE CAN ACCESS STATIC  VARIABLE BY USING VARIABLE NAME , CALSS NAME AND CLASS NAME*/
/* -----------------iMPORTANT POINT---------------*/
//IF STATIC VARIABLE AND LOCAL VARIABLE HAVING SAME NAME THEN PRIORITY WILL BE GIVEN TO LOCAL AVRIABLE 
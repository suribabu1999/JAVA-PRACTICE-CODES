package TypeCasting;

public class ImplicitTypeCasting {
	void meth1() {
		System.out.println("-----Implicit TypeCasting-------");
		byte b=9;
		int a=b;
		System.out.println("Byte Value=====>"+b);
		System.out.println("Int value=======>"+a);
		System.out.println("------------------------------------------------");
		System.out.println("Next coverting char into int");
		System.out.println("------------------------------------------------");
		char c = 'A';
		int  i = c;
		System.out.println("Char value=====>"+c);
		System.out.println("Integer value=====>"+i);
 }
	public static void main(String []args)
	{
		ImplicitTypeCasting obj = new	ImplicitTypeCasting();
		obj.meth1();
	}

}
/* 1.Implicit type casting is converting smaller data type in to Larger data type.
 * 2.it will be done by the compiler automatically
 * 3.There will not be any data loss*/


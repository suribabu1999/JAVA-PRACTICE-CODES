package TypeCasting;

public class ExplicitTypeCasting {
	void meth1() {
		System.out.println("*******Explicite Type Casting********");
		int i=500; //if we take i=500 see below formula
		byte b=(byte)i;
		System.out.println("Interger value==>"+i);
		System.out.println("Byte Value =====>"+b);
		
		
		System.out.println("**********************************");
		System.out.println("Coverting Float into byte");
		System.out.println("**********************************");
		float f=10.78f;
		byte x=(byte)f;
		System.out.println("Float value"+f);
		System.out.println("Byte value "+x);
		//In explicite type casting decimal values will be ignored
	}
	public static void main(String []args)
	{
		ExplicitTypeCasting obj = new ExplicitTypeCasting();
		obj.meth1();
	}

}
//range of byt is -128 to 127
//what  happens if the source data type value is more then the range of the destination data type??
//ans = [minimumRange+(result - maximumRange - 1)]
//[-128 + (500-127-1)]==>244
//[-128 +(244-127-1)]==>-12








/*1. Explicit type casting larger data type to smaller data type
 * 2.There maybe a chance of loss of data
 * 3. compiler will not type caste automatically*/

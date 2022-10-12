package pack1;

public class ClassA 
{
	int a=10;
	public void meth1()
	{
		int b=9;
		int c=a+b;
		System.out.println("Addition==>"+c);
	}
	public void meth2()
	{
		int b=9;
		int c=a*b;
		System.out.println("sub==>"+c);
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		ClassA obj=new ClassA();
		obj.meth1();
		obj.meth2();
		}
	

}

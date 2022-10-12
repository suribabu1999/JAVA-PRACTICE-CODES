package ThiskeyWord;

public class ThisKeyword3 {
	
	
	ThisKeyword3 meth1() 
	{
		
		System.out.println("METHOD 1 IS CALLED");
		return this; //this key word is used to return the instance of the class
	}
	int meth2() 
	{
		
		System.out.println("METHOD 2 IS CALLED");
		return 20;
	}
public void meth3() 
    {
	
	    System.out.println("METHOD 3 IS CALLED");
    }
	
	public static void main(String[] args)
	{
		ThisKeyword3 obj = new  ThisKeyword3(); //object or instance
		int a = new ThisKeyword3().meth2()+10;
		System.out.println(a);
		new ThisKeyword3().meth1().meth3();
	}

}
/*  " new ThisKeyword3().meth1().meth3(); " in this case  newThiskeword3().meth1() is returning the instance of the 
 * class so using that instance/object we call any method from that class*/

package ThiskeyWord;

public class ThisKeyword2 {
	
	public void meth1() {
		
		System.out.println("METHOD 1 IS CALLED");
		this.meth2();
		meth2();//compiler will automatically add this keyword to method 
	}
	public void meth2() {
		
		System.out.println("METHOD 2 IS CALLED");
		this.meth3(); //we can call static methods using this keyword but we can not use this keyword under static context/area
	}
	public void meth3() {
		
		System.out.println("METHOD 3 IS CALLED");
	}
	
	public static void main(String[] args) {
		ThisKeyword2 obj2 = new ThisKeyword2();
		obj2.meth1();
		
	}


}
//this keyword can't be used in static area

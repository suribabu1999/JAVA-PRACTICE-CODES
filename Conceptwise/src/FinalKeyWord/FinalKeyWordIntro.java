package FinalKeyWord;

public final class FinalKeyWordIntro{
	
	public final void meth1() {
		System.out.println("Final Method :");
	}
	
	
	public static void main(String[] args) {
		final int i=9;
		System.out.println(" i value "+i);
		//i=i+10;//we canot change or assign another value to final variable
		//Demo obj = new Demo();
		//obj.meth1();
		
	}

}
/*class Demo extends FinalKeyWordIntro{//
	
/*public void meth1() {
		System.out.println("Overriden method");
	}*/ // method cannot override because of final method present in parent class
	
	
//}




/*We can use 'final' keyword with variable , method and class
 *
 * 
 * 
 * we use 'final' key word before variable so that it value can't be changed
 * 
 * we use 'final' keyword before method so that it can't be override by another method
 * 
 * we use 'final' keyword before any class so that class can't be inherited by another class*/
 
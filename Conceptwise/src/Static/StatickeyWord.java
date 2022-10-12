package Static;

public class StatickeyWord {
	int a=0;
	static int b=9;//instance variable
	
	static void meth1() {
		int b=8;
		
		System.out.println("Static variable=======>"+b);
		System.out.println(" method 1 is called");
		
		
	}
	static {
		System.out.println("Static block is called");
	}
	
	
	
	
	
	public static void main(String []args) {
		
		
		
	StatickeyWord	aobj= new StatickeyWord();
	aobj.meth1();
	}

}

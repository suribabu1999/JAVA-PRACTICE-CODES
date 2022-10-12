package Static;

public class StaticPriority {
	static int a=8;
	static int b=9;
	
	static {
		System.out.println("------SB1 is called------");
		System.out.println("The value of ===========>a "+a);
		System.out.println("The vallue of===========> b" +b);
	}
	static void meth1() {
		System.out.println("-----Method one is called------");
		System.out.println("The value of ===========>a "+a);
		System.out.println("The vallue of===========>b"+b);
	}

	public static void main(String []args) {
		StaticPriority obj=	new StaticPriority();
		obj.meth1();
	}
	static {
		int a =100;
		System.out.println("------SB2 is called------");
		System.out.println("The value of ===========>a "+a);
		System.out.println("The vallue of===========> b" +b);
	}
}

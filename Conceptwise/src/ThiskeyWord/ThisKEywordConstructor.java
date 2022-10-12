package ThiskeyWord;

public class ThisKEywordConstructor {
	
	 ThisKEywordConstructor( ) {
		this(99); 
		System.out.println("Defaule Constructure ");
		
	}
	 ThisKEywordConstructor(int a) {
		System.out.println("The value of a "+a);
	}
	 public static void main(String[] args) {
		new ThisKEywordConstructor();
	}

}
/*this() constructor call always used inside a constructor 
 * it should always first statement in constructor */

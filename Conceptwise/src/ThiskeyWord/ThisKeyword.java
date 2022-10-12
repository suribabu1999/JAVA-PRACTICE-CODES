package ThiskeyWord;

/* In program this key word is used to resol;ve ambiguity between local variable and instance variable*/
public class ThisKeyword {
	int a=10;  //instance variable
	public void meth1()
	{
		int a=20; //Local variable
		System.out.println("Instace Variable===>"+a);
		System.out.println("Local Variable ====>"+this.a);
		//this keyword is used to refer present class instance variable.
	}
	
	public static void main(String[] args) {
		ThisKeyword obj= new ThisKeyword();
		obj.meth1();
		
		
	}

}
/* In JAVA  'this' keyword is used in 4 ways
 *1.this key word is used to resolve the ambiguity between instance variables and Local variables
 *2.this key word is used to call present class instance method 
 *3. this keyword is used to return the instance of a class
 *4.it is used as a Constructor call (used to call present class constructor)*/





//if instance variable and local variable having same name then Ambiguity will arise for compiler and it will give 
//Local variable is having a high priority then instance variable
//we can not use this keyword under static context.this is why we can not able call instance methods using this keyword in mian method
 
package EcceptionHandling;

/*public class Test {

	public static void main(String[] args) {
		doStaff();
		

	}
	public static void doStaff(){
		doMoreStaff();
	}
	public static void doMoreStaff(){
		System.out.println(100/0);
	}

}*/

/*Points to be Discussed 
1. Introduction
2.Runtime Stacked Mechanism
3. Exception Handling 
4.Customized Exception Handling Using Try - Catch
5.Customized Exception Handling Using Try - Catch - Finally
6.Control Flow Of Try- Catch - Finally
7.Methods To Print Exception
8.Try With Multiple Catch Block
9.Throw Key Word 
10.Throws KeyWord
11.Throw , Throws and Throwable
12. final finally , finalize
*/
/****************************************************************************************************************************/






/*public class Test {
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println(100/0);//default exception Handler will create Object and pass it to JVM //AB-Abnormal Termination
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
	}
}*/


public class Test{
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
}




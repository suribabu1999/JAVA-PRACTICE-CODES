package EcceptionHandling;
import java.io.*;
import java.lang.Throwable;

public class Test2  {

	public static void main(String[] args) //throws Exception{
		PrintWriter opr = new PrintWriter("abc.txt");//File Not Found exception.
		System.out.println("Hello World");

	}

}
//********************************Checked Exception**************************************************/



//Checked Exception :- The Exceptions Which are checked by compiler to execute at run time smoothly.

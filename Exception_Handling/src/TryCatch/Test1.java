package TryCatch;
import java.lang.Throwable;

public class Test1 {
public static void main(String[] args) {
	
	try {
		
		System.out.println(100/10);
		System.out.println(100/0);
		System.out.println("Hello");
	}
	
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("Exception is Handled");
}
}

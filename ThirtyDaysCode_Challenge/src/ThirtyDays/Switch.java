package ThirtyDays;
import java.util.*;

public class Switch {

	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/*switch(s) {
		case 'a':
			System.out.println("Ovwel");
			break;
		case 'e':
			System.out.println("Ovwel");
			break;
			
		case 'i':
			System.out.println("Ovwel");
			break;
		case 'o':
			System.out.println("Ovwel");
			break;
		case 'u':
			System.out.println("Ovwel");
			break;
			
		default :
			System.out.println("Consonant");*/
		
		for(int i=0; i<=26;i++) {
			System.out.println("Enter Character ");
			char s = sc.next().charAt(0);
			
		switch(s) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.err.println("Ovwel");
	    break;
	    default :
	    	System.out.println("Consonant");
		
		
		        }
		}
		
	}
}

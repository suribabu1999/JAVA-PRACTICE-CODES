package LetsBeginMan;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		
		int rev = 0, temp;
		temp = n;
		
		while(temp!=0) {
		   int rem = temp%10;
			rev = rev *10 + rem;
			temp=temp/10;
		}
		System.out.println("The reverse is "+rev);
		if(n == rev) {
			System.out.println("Pallendrome Number :");
		}else {
			System.out.println("Nt pallindrome Number");
		}
		
	}
	
	
	
	
}
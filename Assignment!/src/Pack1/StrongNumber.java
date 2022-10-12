package Pack1;
import java.util.*;

public class StrongNumber {
	
	public int factorial(int n) {
		int fact=1;
		
	 for(int i=1;i<=n ;i++) 
	    {
		 
			fact=fact*i;
		}
		
	System.out.println("factorial of that number "+n+"is=======> "+fact);
	return fact;
	}
	public void StrongNum(int n , int x) {
		int temp=0;
		for(int i=0;i<n;i++) {
			temp=temp+i;
			
		}
		if(x==temp) {
			System.out.println("The given number is Strong Number" +x);
		}
		else {
			System.out.println("The Given Number is Not a Strong Number");
		}
		
		
	}
	 
	
	
	public static void main(String[] args) {
		StrongNumber obj = new StrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number to Find Factorial");
		int n = sc.nextInt();
		int x= obj.factorial(n);
		obj.StrongNum(n,x);
		}

}

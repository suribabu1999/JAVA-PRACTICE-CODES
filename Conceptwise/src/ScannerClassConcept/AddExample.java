package ScannerClassConcept;
import java.util.Scanner;

public class AddExample {
	public void meth1(int a , int b) {
		int c=a+b;
		System.out.println("addition "+c);
	}
	public static void main(String[] args) {
		System.out.println("enter Value of a= The Value of b=");
		AddExample obj = new AddExample();
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		obj.meth1(a, b);
	}

}

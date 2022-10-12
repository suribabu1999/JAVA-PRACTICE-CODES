package Arrays;
import java.util.Scanner;

public class OneDimentionalArray {
	

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		int arr [] = new int [50];
		arr[1]=5;
		
		for(int i=0;i<=n;i++) {
			
			System.out.println(" "+ n +" "+ arr[i]);
		
			
		}
	}

}

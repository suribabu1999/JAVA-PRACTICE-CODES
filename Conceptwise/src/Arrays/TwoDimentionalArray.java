package Arrays;
import java.util.Scanner;

public class TwoDimentionalArray {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]= new int[3][3];
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0 ;j<arr.length;j++) {
				
				arr[i][j]=n;
				System.out.print(" "+arr[i][j]);
				n++;
			
			}
			System.out.println("  ");
		}
	}

}

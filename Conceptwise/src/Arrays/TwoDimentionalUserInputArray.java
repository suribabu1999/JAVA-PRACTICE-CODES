package Arrays;
import java.util.*;
public class TwoDimentionalUserInputArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("To get ***********(i X j)********** Matrix ");
		System.out.println("ENTER THE VALUE OF 'i ");
		int c=sc.nextInt();
		System.out.println("ENTER THE VALUE OF 'j ");
		int d=sc.nextInt();
		int a[][]=new int[c][d];
		for(int i=0;i<c;i++) 
		{
			for(int j=0;j<d;j++) 
			{
             System.out.println("Value at ("+i+","+j+")");
				a[i][j]=sc.nextInt();	
			}
		}
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

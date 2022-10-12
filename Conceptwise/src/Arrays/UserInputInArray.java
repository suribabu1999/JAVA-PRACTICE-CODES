package Arrays;
import java.util.*;

public class UserInputInArray {
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of the array :");
		int size=sc.nextInt();
		int array[]=new int [size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the element"+(i+1)+" :");
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}

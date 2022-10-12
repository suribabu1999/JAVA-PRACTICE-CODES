package ArraysPractice;
import java.util.*;
public class Max_Min_Element_Array {
	
	
	
	
	
	public static void main(String []args) {
		
		Max_Min_Element_Array obj = new Max_Min_Element_Array();
		Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
       for(int i = 0 ; i<arr.length;i++) {
    	   System.out.print(arr[i]);
       }
		int temp = arr[0];
		
		
		for(int i=0 ; i<arr.length;i++) {
			
			int j=i;

			if(arr[i]<temp) {
				 temp =arr[i];
			}
		} 
		System.out.println();
		System.out.println("Minimum element :"+ temp);
		
        for(int i=0 ; i<arr.length;i++) {
			
			int j=i;
			if(arr[i]>temp) {
				 temp =arr[i];
			}
		} 
		System.out.println("Maxmam Element :"+temp);
		
		
	}

}

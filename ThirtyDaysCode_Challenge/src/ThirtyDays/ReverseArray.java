package ThirtyDays;
import java.util.*;

public class ReverseArray {
	public void arrayReverse(int array[] , int start ,int  end){
		
		if(start >= end )
			return;
		
		int temp = array[start];
		array[start]=array[end];
		array[end] = temp;
		
		arrayReverse(array,start+1,end-1);
	}
	
	
	
	public static void main (String []args) {
		
		ReverseArray obj = new ReverseArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
       for(int i = 0 ; i<arr.length;i++) {
    	   System.out.print(arr[i]);
       }
       
       
       
      obj.arrayReverse( arr , 0 , arr.length-1 );
      System.out.println();
      for(int i = 0 ; i<arr.length;i++) {
   	   System.out.print(arr[i]);
      }
      
	}

}

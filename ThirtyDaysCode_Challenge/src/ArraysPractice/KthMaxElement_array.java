package ArraysPractice;

import java.util.*;

public class KthMaxElement_array {

	public int Kth_Max(int array[], int size) {

		int temp = array[0];

		for (int i = 1; i < size; i++) {

			if (temp < array[i]) {
				temp = array[i];
			}
		}

		return temp;
	}

	public void Sort(int array[], int size,int K ) {
		int temp;

		for (int i = 0; i < size; i++) {
			for(int j = i+1;j<size ; j++) {
				if(array[i]<array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println(); 
		
		for(int i=0;i<size;i++) 
		{
		  System.out.print(array[i]); 
		 }
		System.out.println();
		System.out.println("The "+K+"th Max Element is ===>"+array[K-1]);
		
	}

	public static void main(String[] args) {
		KthMaxElement_array obj = new KthMaxElement_array();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int arr[] = new int[sc.nextInt()];
		

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
		int max = obj.Kth_Max(arr, arr.length);
		System.out.println();
		System.out.println("Max Element ===>" + max);
		System.out.println("Enter the value of k===> ");
		int k = sc.nextInt();
        obj.Sort(arr, arr.length,k);
		System.out.println();
		
		
		
	}

}



 

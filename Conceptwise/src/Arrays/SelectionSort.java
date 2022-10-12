package Arrays;

public class SelectionSort { 
	
	
	public static void main(String[] args) {
		int a[]= {4,6,8,9,11,1,12,};

		
		for(int i=0 ;i<a.length;i++) // number of rounds 
		{
			int min=i;
			int temp=0;
			for(int j=i+1;j<a.length;j++)// comparing the first element with rest to find smallest element
			{
				if(a[j]<a[min]) 
				{
					min=j;// we will interchange the index values 
				}
			}
			temp = a[i];
			a[i]=a[min];// we will swap the first and smallest element
			a[min]=temp;
			
		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}
/*Selection sort is a combination of searching and sorting 
 * it sorts an array by repeatedly finding the minimum element from unsorted part and putting it at the
 * beginning */

// the algorithm maintains two sub arrays
// 1. sub algorithm which is sorted 
// 2. sub algorithm which is unsorted

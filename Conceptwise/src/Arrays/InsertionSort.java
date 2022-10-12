package Arrays;

public class InsertionSort 
{
	public static void main(String[] args)
	{
		int temp,j;
		int a[]= {2,5,4,3,6,7};
		for(int i=1 ; i<a.length;i++) 
		{
			
			
			temp=a[i]; //First element 
			j=i; //1
			
			while(j>0 && a[j-1]>temp)// 1>0 and a[0]>a[1]
			{
			    a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
			
			
		}
		for(int i = 0; i < a.length;i++) {
			System.out.print(a[i]);
		}
	
		
		
	}

}

package ThirtyDays;

public class Negitive_Elements_oneside {
	
	
	public void swap(int array[], int len )
	{
		int j=0 , temp;
		for(int i=0; i<len ; i++) {
			
			if(array[i]<0) {
				if(i!=j) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
					j++;
				}
			}
		}
		for(int i=0 ; i<len;i++) {
			System.out.println(array[i]);
		}
	}
	
	

	public static void main(String[] args) {
		
		
		Negitive_Elements_oneside ob = new Negitive_Elements_oneside();
		int arr [] = {1,2,-3,-5,6,7,-8 };
		int l = arr.length;
		ob.swap(arr, l);
		
		
		

}
}
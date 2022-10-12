package ThirtyDays;


public class Rotate_Array_By_One {
	
	public void Rotate(int array[] , int size) {
		
		int x=array[size-1];
		
		for(int i = size-1;i>0;i--) {
			array[i]=array[i-1];
			array[0]=x;
		}
		for(int i = 0 ; i<size ; i++) {
			System.out.print(array[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		Rotate_Array_By_One ob = new Rotate_Array_By_One();
		
		int arr[] = {1,2,3,4,5,6,7,8};
		
		int l = arr.length;
		ob.Rotate(arr, l);
		
		
	}

}

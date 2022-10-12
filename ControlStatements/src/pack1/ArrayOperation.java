package pack1;

public class ArrayOperation {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6,7};
	for(int i=0 ; i<a.length ; i++)
		System.out.print(a[i]+" ");
	System.out.println();
	
	float sum=0 , avg;
	for(int i=0;i<a.length;i++)
	sum+=a[i];
	avg=sum/a.length;
	System.out.println("The Average of the given elements : "+avg);
}
}
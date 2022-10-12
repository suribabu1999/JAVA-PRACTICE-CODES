package Arrays;

public class BubbleSorting {

	
 public static void main(String[] args)
   {
	 int temp;
	 int a []= {42,3,45,65,76,87,87};
	 
	 for(int i=0;i<a.length;i++) //this for is for no of rounds of operation. always length-1 operations
	 {
		 int flag =0;
		 for(int j=0;j<a.length-1-i;j++) //for comparisons
		 {
			 if(a[j]>a[j+1]) 
			 {
				 temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
				 flag=1;
			 }
		 }
		 if(flag==0) {
			 break;
		 }
	 }
	 for(int i=0; i<a.length;i++)
	 {
		 System.out.print(" "+a[i]);
	 }
	
   }
}




/*Sorting : Sorting is the process of arranging the DATA in logical order
 * example:- if it a numeric then ascending and descending order----dicery order */

/* Bubble sort :- bubble sort also referred as sinking sort ..it is comparison based algorithm
 * i.e, comparing two adjacent elements and swap the elements for require order*/
//856743
//sorted 345678
 
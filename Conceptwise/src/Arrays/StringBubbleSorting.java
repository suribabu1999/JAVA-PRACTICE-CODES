package Arrays;
//String bubble sorting by using compareTo method of string
public class StringBubbleSorting {
	
	public static void main(String[] args)
	   {
		 String temp;
		 String a []= {"Raju","Anesh","Ramesh","Suresh","Givaa"};
		 
		 for(int i=0;i<a.length;i++) //this for is for no of rounds of operation. always length-1 operations
		 {
			 int flag =0;
			 for(int j=0;j<a.length-1-i;j++) //for comparisons
			 {
				 if(a[j].compareTo(a[j+1])>0) 
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

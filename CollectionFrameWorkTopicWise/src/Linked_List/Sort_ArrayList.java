package Linked_List;
import java.util.*;

public class Sort_ArrayList {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(20);//0
		li.add(54);//1
		li.add(59);//2
		li.add(23);//3
		li.add(232);//4
		li.add(343);//5
	   // Collections.shuffle(li);
		
	    //Collections.sort(li);
		  //Collections.reverse(li); 
		
		for(Integer x : li) {
			System.out.println(x);
		}
	}

}

/*
 * The java.util package provides a utility class Collections which has the
 * static method sort(). Using the Collections.sort() method, we can easily sort
 * the ArrayList.
 */
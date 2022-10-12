package Linked_List;
import java.util.*;

public class Introduction_0 {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Suri");
		list.add("Prassu");
		list.add("Raju");
		list.add("Manu");
		list.add("deepu");
		
      //Iterating ArrayList using Iterator
		System.out.println("================Iterating ArrayList using Iterator===========");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(""+itr.next());
		}
     //Iterating ArrayList using For-each loop
		System.out.println("=============Iterating ArrayList using For-each loop==============");
		for(String x : list) {
			System.out.println(x);
		}
		
		
	}

}

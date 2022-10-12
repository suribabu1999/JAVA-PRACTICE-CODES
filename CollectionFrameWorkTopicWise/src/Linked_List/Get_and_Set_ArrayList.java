package Linked_List;
import java.util.*;

public class Get_and_Set_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> li =new ArrayList<String>();
     li.add("Ramarao");
     li.add("suri");
     li.add("Prassu");
     li.add("swathi");
     li.add("manu");
     li.add("Laxmi");
     
     System.out.println(""+li.set(1, "Suresh"));
     
     for(String m : li) {
    	 System.out.println(m);
    	 System.out.println(li.get(0));
     }
     
     
		/* Fun  code*/
     String s1 = li.get(1);
     System.out.println(s1);
     
	}

}
/*
 * The get() method returns the element at the specified index, whereas the
 * set() method changes the element.
 */

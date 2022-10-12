package Collection1;
import java.util.*;
public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>() ;
		ArrayList<String> str2 = new ArrayList<String>();
		str.add("Suri");
		str2.add("Mummy");
		str.add("is best");
		Iterator it = str.iterator();
		Iterator it2 = str2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
 * The ArrayList class implements the List interface. It uses a dynamic array to
 * store the duplicate element of different data types. The ArrayList class
 * maintains the insertion order and is non-synchronized. The elements stored in
 * the ArrayList class can be randomly accessed.
 */


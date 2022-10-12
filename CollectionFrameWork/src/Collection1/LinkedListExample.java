package Collection1;
import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		
		List<String> li = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		li.add("Suri");
		li.add("daddy");
		li.add(s1);
		li.add(s1);
		li.add(s1);
		
		Iterator<String> itr = li.iterator();
		
		for(int i =0 ; i<li.size();i++) 
		{
			
			System.out.println(itr.next());
			
		}
		
		
	}

}

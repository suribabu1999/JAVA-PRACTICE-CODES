package Collection1;
import java.util.*;

public class VectorExample {
	
	public static void main(String[] args) {
		Vector<String> vc = new Vector<String> ();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		vc.add(s1);
		vc.add(s1);
		vc.add(s1);
		vc.add(s1);
		vc.add(s1);
		
		Iterator itr = vc.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}

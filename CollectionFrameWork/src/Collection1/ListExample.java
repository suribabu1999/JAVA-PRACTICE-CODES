package Collection1;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li= new ArrayList<Integer>();
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(80);
		
		Iterator ita = li.iterator();
	while(ita.hasNext())
	{
		System.out.println(li);
	}
		
	}

}

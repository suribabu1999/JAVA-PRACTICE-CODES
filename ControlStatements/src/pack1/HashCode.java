package pack1;

public class HashCode {
	void meth1()
	{
		System.out.println("Class  A method");
	}
public static void main(String[] args) {
	
	
	HashCode aobj1 = new HashCode();
	HashCode aobj2 = new HashCode();
	
	int a = aobj1.hashCode();
	int c = aobj2.hashCode();
	
}
}

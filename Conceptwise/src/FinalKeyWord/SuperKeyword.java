package FinalKeyWord;

public class SuperKeyword {
	
	int i =10;
public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		obj.m1(10);
	}

}
class ClassA extends SuperKeyword{
	
	
	int i=30;
	public void m1(int i)
	{
		System.out.println(""+i);
		System.out.println("Present class instance variable "+this.i);
		System.out.println("Parent class or super class instance variable "+super.i);
	}
	
}
package Abstraction;

//****************Abstract class and Method ****************************
public class AbstractClass{
	
	public static void main(String[] args) 
	{
		
		//SureshPhone obj = new SureshPhone();
		//obj.call();
		RajeshPhone obj = new RajeshPhone();
		obj.call();
		obj.cook();
		obj.dance();
		obj.move();
		
		
	}

}
abstract class SureshPhone  // abstract class
 {
	
	public void call() {
		System.out.println("Calling......"); // concrete method
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}
abstract class RameshPhone extends SureshPhone
{
	
    public void move()
    {
		System.out.println(" Moving.....");
	}
    public void cook()
    {
		System.out.println("Cooking...");
	}

}
class RajeshPhone extends RameshPhone
{
	public void dance() {
		System.out.println("Dansing...");
		
}
}



/* if declare a abstract class then */
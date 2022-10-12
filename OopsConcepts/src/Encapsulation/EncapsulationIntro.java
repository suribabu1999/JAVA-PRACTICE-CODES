package Encapsulation;

public class EncapsulationIntro {
	
	private int roll_no; //we make the variable as private for hiding the data 
	private String name;
	
	public void setName(String name) //we create setters and getters for access the data or retrieve the data
	{
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setRollno(int roll_no) {
		this.roll_no=roll_no;
	}
	public int getRollno() {
		return roll_no;
	}
	

	
	public static void main(String[] args) {
		
		
		EncapsulationIntro obj = new EncapsulationIntro();
		obj.setName("Suri");
		System.out.println("THE STUDENT NAME IS "+obj.getName());
		obj.setRollno(4);
		System.out.println("THE STUDENT ROLL NO IS "+obj.getRollno());
	}


}


/*Encapsulation :- Encapsulation in java is a mechanism of wrapping data (variables)
 * and code acting on the data (methods) together as a single unit*/

/*In encapsulation the variables of class will be hidden from other classes and can be  accessed only
 * through the methods of their current class, This concept is known as data hiding,*/

/************Steps to achieve Encapsulation************************/
        /*1. Declare the variables of class as private
         *2. Provide public setter and getter methods to modify and view the variable values*/
 
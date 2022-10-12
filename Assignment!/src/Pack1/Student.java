package Pack1;

public class Student {
	public void Student(String string) {
		System.out.println(string);
		
		
	}

     public void Student()
     {
	System.out.println("Unknown");
     }
     
     
     public static void main(String[] args) {
		Student obj = new Student();
		obj.Student("raju");
		obj.Student();
		
      }

}

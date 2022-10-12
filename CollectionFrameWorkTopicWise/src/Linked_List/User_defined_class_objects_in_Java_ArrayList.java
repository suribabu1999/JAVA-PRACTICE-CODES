package Linked_List;
import java.util.*;

public class User_defined_class_objects_in_Java_ArrayList {
 
	public static void main(String[] args) {
		
		Student s1 = new Student(30,"Suresh");
		Student s2 = new Student(40,"Ramesh");
		Student s3 = new Student(60,"Mahesh");
		
		
		ArrayList<Student> li = new ArrayList<Student>();
		
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
	Iterator itr = li.iterator();
	while(itr.hasNext()) {
		Student st =(Student) itr.next();
		System.out.println(st.name+" "+st.rollno);
	}
		
	}
}
 class Student{
	int rollno;
	String name;
	
	
	Student(int rollno , String name){
		this.name=name;
		this.rollno = rollno;
	}
	
}
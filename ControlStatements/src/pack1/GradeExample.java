package pack1;

public class GradeExample {
public static void main(String[] args) {
 int marks=1000;
    
if(marks<50) {
	 System.out.println("Fail Student No grade Appeare");
}
else if(marks>=50 && marks<60)
{
	System.out.println("Graded D Student");
	
}
else if(marks>=60 && marks<70)
{
	System.out.println("Graded C Student");
	
}
else if(marks>=70 && marks<80)
{
	System.out.println("Graded B Student");
	
}
else if(marks>=80 && marks<90)
{
	System.out.println("Graded A Student");
	
}
else if(marks>=90 && marks<100)
{
	System.out.println("Graded A+ Student");
	
}
else
{
	System.out.println("INVALID VALUE OF MARKS :");
}
}
}

package APPLICATION_3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-5PV5DC2:1521:xe","system","system");
			Statement st = con.createStatement();
			System.out.println("Enter Employee ID :");
			
			int eid = sc.nextInt();
			
			
			System.out.println("Enter Employee Name :");
			String ename = sc.next();
			
			System.out.println("Enter Emplopyee Designation :");
			String edes = sc.next();
			
			System.out.println("Enter Employee Salaree");
			int sal = sc.nextInt();
			
			
			int k = st.executeUpdate("insert into Emp38 values('"+eid+"','"+ename+"','"+edes+"','"+sal+"')");
			
			if(k>0) {
				System.out.println("values inserted successfully :");
			}
			
			sc.close();
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}


//create table Emp38(eid varchar2(10),ename varchar2(15),desg varchar2(10),
//		  2  bsal number(10),primary key(eid))

package ExecuteUpdateStatementExample;
import java.sql.*;
import java.util.*;


public class Test1 {
	
	
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id of Employee");
		    int EmpId = sc.nextInt();
		    System.out.println("Enter Name of Employee");
			String name = sc.next();
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement stm = con.createStatement();
			
			int k = stm.executeUpdate("insert into Emp11 values('"+EmpId+"','"+name+"')");
			if(k>0) {
				System.out.println("executed Succefully");
			}
			
			
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

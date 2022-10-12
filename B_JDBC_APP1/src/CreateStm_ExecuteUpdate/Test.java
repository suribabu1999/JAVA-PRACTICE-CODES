package CreateStm_ExecuteUpdate;
import java.sql.*;
import java.util.*;

public class Test {
   public static void main(String[] args) {
	try {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Scanner sc = new Scanner(System.in);
		Statement stm = con.createStatement();
		System.out.println("Enter Student Name :");
		String name = sc.nextLine();
		System.out.println("Enter Student age:");
		Long age = sc.nextLong();
		System.out.println("Enter Student Roll no :");
		Long rollno = sc.nextLong();
		System.out.println("Enter Student Class in text :"); 
		String cls = sc.next();
		
		int k = stm.executeUpdate("insert into School values('"+name+"',"+age+","+rollno+",'"+cls+"')");
		
		if(k>0) {
			System.out.println("Data Enterd ");
			
		}else {
			System.out.println("Date not Enterd");
		}
		
		
	}catch(Exception e) {
		System.out.println(e);
		
	}
}
}

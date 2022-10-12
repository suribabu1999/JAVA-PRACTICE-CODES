package PREAPARESTATEMENT;
import java.sql.*;
import java.util.*;

public class TEST {
	
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Account NO :");
			long accno = Long.parseLong(sc.nextLine());
			CallableStatement cs = con.prepareCall("{call createaccount11(?,?,?,?,?,?,?,?)}");
		    cs.setLong(1, accno);
		    cs.registerOutParameter(2, Types.VARCHAR);
		    cs.registerOutParameter(3, Types.VARCHAR);
		    cs.registerOutParameter(4, Types.INTEGER);
		    cs.registerOutParameter(5, Types.VARCHAR);
		    cs.registerOutParameter(6, Types.INTEGER);
		    cs.registerOutParameter(7, Types.VARCHAR);
		    cs.registerOutParameter(8, Types.INTEGER);
		    
		    cs.execute();
		    System.out.println("Account No :"+accno);
		    System.out.println("First Name :"+cs.getString(2));
		    System.out.println("Last Name :"+cs.getString(3));
		    System.out.println("Roll No :"+cs.getInt(4));
		    System.out.println("Grade :"+cs.getString(5));
		    System.out.println("Coustmer ID  "+cs.getInt(6));
		    System.out.println("Course  Name "+cs.getString(7));
		    System.out.println("Duration : "+cs.getInt(8));
		    cs.close();
		    
			
			
			
		}catch (Exception e ) {
			System.out.println(e);
		}
	}
	

}

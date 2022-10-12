package APPLICATION_4;
import java.util.*;
import java.sql.*;

public class Test {

	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-5PV5DC2:1521:xe","system","system");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Student RollNo ");
			String rno = sc.next();
			
			System.out.println("Enter Student Name :");
			String sname = sc.next();
			
			System.out.println("Enter Student  branch :");
			
			String sbra = sc.next();
			
			System.out.println("Enter Student address :");
			String add = sc.next();
			
			System.out.println("Enter Student emid");
			String emid = sc.next();
			
			
			System.out.println("Enter Student"
					+ " Phone No : ");
			long phn = sc.nextLong();
			
			PreparedStatement ps = con.prepareStatement("insert into student38 values(?,?,?,?,?,?)");
			
			ps.setString(1,rno);
			ps.setString(2,sname);
			ps.setString(3,sbra );
			ps.setString(4,add );
			ps.setString(5,emid );
			ps.setLong(6,phn );
			
			int k = ps.executeUpdate();
			
			if(k>0) {
				System.out.println(" Update Completed :");
			}
			
			sc.close();
			
		}
   catch(Exception e) {
	   System.out.println(e);
   }
	}

}


/*
 * create table Student38(rno varchar2(15),sname varchar2(15), branch
 * varchar2(10),address varchar2(15),mailid varchar2(25), phno
 * number(15),primary key(rno));
 */

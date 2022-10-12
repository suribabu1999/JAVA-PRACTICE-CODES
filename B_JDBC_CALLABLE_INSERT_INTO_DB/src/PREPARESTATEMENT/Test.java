package PREPARESTATEMENT;
import java.sql.*;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Scanner sc = new Scanner(System.in);
			System.out.println("-------------------------Date base Connection For Library Management System-----------------------------");
			System.out.println("Enter Student account Number :");
			Long accno = Long.parseLong(sc.nextLine());//1
			System.out.println("Enter Student First Name :");
			String fname = sc.nextLine();//2
			System.out.println("Enter Student Last Name :");
			String lname = sc.nextLine();//3
			System.out.println("Enter Student Roll Number :");
			Long rollno = Long.parseLong(sc.nextLine());//4
			System.out.println("Enter Student Grade :");
			Long grade = Long.parseLong(sc.nextLine());//5
			System.out.println("Enter Student Cousre ID ");
			Long cid = Long.parseLong(sc.nextLine());//6
			System.out.println("Enter Student Course name :");
			String cname = sc.nextLine();//7
			System.out.println("Enter Student Course Duration ------> ");
			System.out.println("Exaple 1 ---> For one year");
			Long duration = Long.parseLong(sc.nextLine());//8
			
			CallableStatement cs = con.prepareCall("{call createaccount11(?,?,?,?,?,?,?,?) }");
			
			cs.setLong(1, accno);
			cs.setString(2, fname);
			cs.setString(3, lname);
			cs.setLong(4, rollno);
			cs.setLong(5, grade);
			cs.setLong(6, cid);
			cs.setString(7, cname);
			cs.setLong(8, duration);
			
			cs.execute();
			System.out.println("Execution Success");
			cs.close();
			
			
			
			
		}catch (Exception e){
			System.out.println(e);
			
		}
	}

}

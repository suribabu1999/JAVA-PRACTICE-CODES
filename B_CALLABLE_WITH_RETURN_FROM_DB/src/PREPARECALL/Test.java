package PREPARECALL;
import java.sql.*;
import java.util.*;

public class Test {
public static void main(String[] args) {
	
	try {
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Scanner sc = new Scanner(System.in);
		System.out.println("Connected......");
		System.out.println("Enter account Number :");
		long accno = Long.parseLong(sc.nextLine());
		CallableStatement cs = con.prepareCall("{call ?:=callstudent11(?)}");
		cs.registerOutParameter(1, Types.INTEGER);
		cs.setLong(2, accno);
		cs.execute();
		System.out.println("Account number :"+accno);
		System.out.println("Roll no is :"+cs.getInt(1));
		cs.close();
		
		
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
}

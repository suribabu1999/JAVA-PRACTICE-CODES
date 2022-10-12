package CALLABLE;

import java.sql.*;
import java.util.Scanner;

public class DB_CONNECTION {
	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
	    	 Connection	con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system"); 
	    	       System.out.println("enter account number");
	    	       long accno=Long.parseLong(sc.nextLine());
	    	       System.out.println("enter the cust name:");
	    	       String cname= sc.nextLine();
	    	       System.out.println("enter the balance:");
	    	       float bal  =Float.parseFloat(sc.nextLine());
	    	       System.out.println("enter the acc type :");
	    	      String acctype=sc.nextLine();
	    	       System.out.println("enter the address:");
	    	      String addr=sc.nextLine(); 
	    	       System.out.println("enter the email id");
	    	      String mid=sc.nextLine(); 
	    	       System.out.println("enter the phno:");
	    	      long phno=Long.parseLong(sc.nextLine());
	    	     
	    	     CallableStatement cs = con.prepareCall("{ call createAccount38(?,?,?,?,?,?,?)}");
	    	     
	    	     cs.setLong(1,accno);
	    	     cs.setString(2,cname);
	    	     cs.setFloat(3,bal);
	    	     cs.setString(4,acctype);
	    	     cs.setString(5,addr);
	    	     cs.setString(6,mid);
	    	     cs.setLong(7,phno);
	    	    
	    	     cs.execute();//procedure execution
	    	     System.out.println("process Executed Successfully");
	    	     sc.close();
	    	       
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

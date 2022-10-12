package Execute_Quary;
import java.sql.*;

public class Test {

	public static void main(String[] args) {
		try {
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from School");
			if(rs.next()){
				System.out.println(rs.getString(1)+"\t "+rs.getInt(2)+" \t"+rs.getInt(3)+" \t"+rs.getString(4));
				
			}else
			{
				System.out.println("Quary not executed");
			}                                                                         
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}

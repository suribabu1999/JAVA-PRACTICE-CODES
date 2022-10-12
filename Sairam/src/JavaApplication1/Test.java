package JavaApplication1;
import java.sql.*;

import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select *from Student11");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}

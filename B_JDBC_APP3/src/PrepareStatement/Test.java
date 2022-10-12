package PrepareStatement;
import java.sql.*;

public class Test {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			PreparedStatement ps = con.prepareStatement("select * from School");
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1)+"\t "+rs.getInt(2)+" \t"+rs.getInt(3)+" \t"+rs.getString(4));
				
			}
			else {
				System.out.println("Not Found");
			}
			
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}

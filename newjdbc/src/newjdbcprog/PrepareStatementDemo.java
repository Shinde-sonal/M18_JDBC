package newjdbcprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class PrepareStatementDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con =null;
		PreparedStatement pt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Sonalshinde@09");
			pt = con.prepareStatement("insert into employee values(?,?,?)");
			pt.setInt(1, 1);
			pt.setString(2,"Mayuri");
			pt.setDouble(3, 30000);
			int i = pt.executeUpdate();
			System.out.println("No. of rows affected -" +i);
		}
		catch(Exception e) {
			
		}
		finally {
			try {
				if(pt!= null) {
					pt.close();
					pt =null;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(con!= null) {
					con.close();
					con = null;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

package newjdbcprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StudentStatementInsert {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/test";
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password","admin");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Sonalshinde@09");
		Statement st = con.createStatement();
		String query = "insert into student values(3,'Aniket',20)";
		int i = st.executeUpdate(query);//
		boolean t = st.execute("insert into student values(4,'Jyoti',40)");
		System.out.println("No of rows affected:" + i);//1
		System.out.println("Query executed" + t);//
		System.out.println("Row inserted successfully");
		st.close();
		con.close();



	}

}
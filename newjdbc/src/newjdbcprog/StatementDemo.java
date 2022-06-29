package newjdbcprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StatementDemo {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Sonalshinde@09");
		String url = "jdbc:mysql://localhost:3306/b3tns";
		Properties p= new Properties();
		p.put("user", "root");
		p.put("password", "admin");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		Statement st = con.createStatement();
		String query1 = "create table student( studentId int primary key, studentName varchar(20), studentMarks int)";
		int i = st.executeUpdate(query1);
		int j = st.executeUpdate("create table student1(studentId int primary key, studentName varchar(20), studentMarks int");
		System.out.println("No of rows affected: " +i);//0
		System.out.println("No of rows affected: " +j);//0
		System.out.println("Table created Sucessfully");
		st.close();//comminication
		con.close();//connection

	}

}

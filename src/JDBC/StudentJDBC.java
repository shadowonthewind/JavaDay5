package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Student.Student;

public class StudentJDBC
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub

		//1. Driver
		Class.forName("com.mysql.jdbc.Driver");
		//2. Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "password");
		//3. Statement
		Statement st = connection.createStatement();
		//4. Execute the query
		ResultSet rs = st.executeQuery("SELECT * FROM test.student");
		//5. Process
		while (rs.next())
		{
			Student s = new Student();
			s.setMatricNumber(rs.getString("matric"));
			s.setName(rs.getString("Name"));
			s.setNickname(rs.getString("details"));
			System.out.println(s);
		}
		//6. Close
		connection.close();
	}

}

package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import Student.Student;

public class PrepStatement
{
	private static Connection connection;
	private static Statement statement;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private static void openConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
			
		} catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void closeConnection()
	{
		try
		{
			statement.close();
			connection.close();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insertStudent(Student s)
	{
		try
		{
			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			openConnection();
			ps = connection.prepareStatement("INSERT INTO demo.student(matric, name, nick, dob, fee) VALUES (?,?,?,?,?)");
			ps.setString(1, s.getMatricNumber());
			ps.setString(2, s.getName());
			ps.setString(3, s.getNickname());
			ps.setString(4, df.format(s.getDob()));
			 int result = ps.executeUpdate();
			closeConnection();
			return result;
			
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
}

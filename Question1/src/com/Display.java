package com;
//program to display records from database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Display {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost3306/IGTExam","root","1234");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select* from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+(":  ")+rs.getString(2)+(":  ")+rs.getInt(3)+(":  ")+rs.getInt(4)+(":  ")+rs.getString(5));
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PreparedStatement = null;

    
    public Demo() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		int Sid = Integer.parseInt(request.getParameter("uSid"));
		String SName = request.getParameter("uSname");
		int Phone = Integer.parseInt(request.getParameter("uPhone"));
		int Marks = Integer.parseInt(request.getParameter("uMarks"));
		String Branch= request.getParameter("uBranch");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost3306/IGTExam","root","1234");
			java.sql.PreparedStatement pstmt = con.prepareStatement("insert into Student values (?,?,?,?,?)");
		
			pstmt.setInt(1,Sid);
			 pstmt.setString(2,SName);
			 pstmt.setInt(3,Phone);
			 pstmt.setInt(4,Marks);
			 pstmt.setString(5,Branch);
			 
			 pstmt.execute();
			 
			 out.print("Sid : " +Sid+"<br>");
			 out.print("Sname : " +SName+"<br>");
			 out.print("Phone : " +Phone+"<br>");
			 out.print("Marks : " +Marks+"<br>");
			 out.print("Branch : " +Branch+"<br>");
			 
			 out.println("Congrats you are succesfully registerd");
			 
			 
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
		
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

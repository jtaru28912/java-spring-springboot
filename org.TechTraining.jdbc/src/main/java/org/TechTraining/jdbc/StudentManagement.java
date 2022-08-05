package org.TechTraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentManagement {
	

	public static void main(String[] args) {
		Connection connection ;
		//loading driver 
		try 
		{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage"+ "user = root&password = Global@113#");
			System.out.println("connected successfully");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet resultset = stmt.executeQuery("Select * from students");
			while(resultset.next()) {
				System.out.println(resultset.getInt("sid")+ " "+ resultset.getString("sname")+ " "+ resultset.getInt("phone")+" "+ resultset.get);
			}
		}
		catch(Exception e)
		{
			
			
		}

	}

}

package org.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

//student data access object layer (Api layer of project)
public class StudentDao {
	
	public static boolean insertStudentToDB(Studentmodel st) {
		//JDBC code
		boolean isConnectionEstablished = false;

		try {
			Connection connection=  ConnectionProgram.createCP();
			String query = "insert into students(sname , phone , city) values(?,?,?)";
			//prepared statement
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentName());
			pstmt.setString(3,st.getStudentCity());
			
			pstmt.executeUpdate();
			isConnectionEstablished = true;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		//Connection connection =
		return isConnectionEstablished;
	}

	
	

}

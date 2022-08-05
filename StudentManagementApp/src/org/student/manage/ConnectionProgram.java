package org.student.manage;
import java.sql.DriverManager;
import java.sql.Connection;


public class ConnectionProgram {
		static Connection connection;
	public static Connection createCP(){
		
		
		//Exception-check db loading
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver ");
			//activates jdbc domain with driver
			
			String user = "taru.jain";
			String password= "Global@113#";
			String url = "jdbc:mysql://localhost:3306/Student_manage?useSSL=false";
			connection = DriverManager.getConnection(url,user,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}

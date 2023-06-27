package Attendence;

import java.sql.*;

public class StudentDetailsFromTeacher {
	public static void DisplayStudents() throws Exception {
		String URL="jdbc:mysql://localhost:3306/Students";
		String USER = "root";
		String PASSWORD = "indrajit";
		Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("Select * from Student");
		while(rs.next()) {
			System.out.println("Name :"+rs.getString(1));
			System.out.println("RollNo: "+rs.getInt(2));
			System.out.println("Class: "+rs.getString(3));
			System.out.println("Gender: "+rs.getString(4));
			System.out.println("DOB: "+rs.getString(5));
			System.out.println("MarkPercentage: "+rs.getFloat(6));
			System.out.println("AttendancePercentage: "+rs.getFloat(7));
			System.out.println("Age: "+rs.getInt(8));
			System.out.println("Address: "+rs.getString(9));
			System.out.println("MobileNumber: "+rs.getLong(10));
			System.out.println();
			
		}
	}

}

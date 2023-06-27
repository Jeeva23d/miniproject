package Attendence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExamEligible {
	public static void Exam() throws Exception{	
		String URL = "jdbc:mysql://localhost:3306/Students";
		String User = "root";
		String Password = "indrajit";
		Connection con = DriverManager.getConnection(URL,User,Password);
		PreparedStatement ps = con.prepareStatement("select * from Student where AttendancePercenage > 80");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println("Name :"+rs.getString(1));
			System.out.println();
		}
	}
	}


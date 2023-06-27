package Attendence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Percentage {
public static void getPercentage(float per) throws Exception{	
	String URL = "jdbc:mysql://localhost:3306/Students";
	String User = "root";
	String Password = "indrajit";
	Connection con = DriverManager.getConnection(URL,User,Password);
	PreparedStatement ps = con.prepareStatement("select * from Student where AttendancePercenage > ?");
	ps.setFloat(1, per);
	ResultSet rs = ps.executeQuery();
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

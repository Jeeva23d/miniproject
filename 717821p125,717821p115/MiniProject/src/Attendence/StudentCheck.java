package Attendence;
import java.sql.*;
import java.util.*;
public class StudentCheck {
public static boolean StudentProfile(String name,String pass) throws Exception{
	String URL="jdbc:mysql://localhost:3306/Students";
	String USER = "root";
	String PASSWORD = "indrajit";
	Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
	PreparedStatement ps  = con.prepareStatement("select * from Student where Name=?");
	ps.setString(1, name);
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		if(pass.equals(rs.getString(11)));
		{
			return true;
		}
	}
	return false;
}
}

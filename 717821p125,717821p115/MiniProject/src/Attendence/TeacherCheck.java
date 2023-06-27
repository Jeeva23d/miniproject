package Attendence;

import java.sql.DriverManager;
import java.sql.*;
public class TeacherCheck {
public static boolean TeacherPasswordCheck(String name,String pass)throws Exception {
	String URL="jdbc:mysql://localhost:3306/Students";
	String USER = "root";
	String PASSWORD = "indrajit";
	Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
	PreparedStatement ps  = con.prepareStatement("select * from Teacher where name = ?");
	ps.setString(1, name);
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		if(pass==rs.getString(2));
		return true;
	}

return false;
}
}

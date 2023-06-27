package Attendence;
import java.sql.*;
import java.util.*;
public class InsertStudent {

	public static void InsertStudent() throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		System.out.println("RollNo: ");
		int roll = sc.nextInt();
		System.out.println("Enter the Class: ");
		sc.nextLine();
		String clas = sc.nextLine();
		System.out.println("Enter the Gender: ");
		String gen = sc.nextLine();
		System.out.println("Enter the DOB: ");
		String dob = sc.nextLine();
		System.out.println("Enter the Mark Percentage: ");
		float per = sc.nextFloat();
		System.out.println("Enter the Attendance: ");
		float mark = sc.nextFloat();
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		System.out.println("Enter the Address: ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("Enter the MobileNumber");
		long num = sc.nextLong();
		System.out.println("Enter the Password: ");
		sc.nextLine();
		String pass = sc.nextLine();
		String URL = "jdbc:mysql://localhost:3306/Students";
		String User = "root";
		String Password = "indrajit";
		Connection con = DriverManager.getConnection(URL,User,Password);
		PreparedStatement ps = con.prepareStatement("insert into Student values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,name);
		ps.setInt(2, roll);
		ps.setString(3, clas);
		ps.setString(4, gen);
		ps.setString(5, dob);
		ps.setFloat(6, per);
		ps.setFloat(7, mark);
		ps.setInt(8, age);
		ps.setString(9, address);
		ps.setLong(10, num);
		ps.setString(11,pass);
		int result = ps.executeUpdate();
		System.out.println("Student Profile Inserted Successfully!!!");
	}
	}


package Attendence;
import java.sql.*;
import java.util.*;
public class Student {
public static void main(String [] args) throws Exception{
	Scanner sc = new Scanner(System.in);
	System.out.println("*********WELCOME**********");
	System.out.println();
	System.out.println("Are you a Teacher(T) or Student(S):");
    char ch=sc.next().charAt(0);
    if(ch=='T')
    {
    	System.out.println("Teacher Access:");
    	System.out.println("Enter Name:");
    	sc.nextLine();
    	String name1=sc.nextLine();
    	System.out.println("Enter Password:");
    	String pas=sc.nextLine();  
    	try {
    	if(!TeacherCheck.TeacherPasswordCheck(name1,pas)) {
    		throw new PasswordException("**********Wrong Password**********");
    	}
    		else
        	{
        	System.out.println("Login Successful!!!");
        	System.out.println();
        	System.out.println("1.Student Details");
        	System.out.println("2.Insert Student Details");
        	System.out.println("3.Attendance Percentage");
        	System.out.println("4.Mark Percentage");
        	System.out.println("5.Eligible to write Exam");
        	System.out.println("6.Not Eligible to write Exam");
        	int choice = sc.nextInt();
        	if(choice==1) {
        		StudentDetailsFromTeacher.DisplayStudents();
        		
        	}
        		
        	if(choice==2) {
        		InsertStudent.InsertStudent();
        	}
        	if(choice==3) {
        	System.out.println("Enter the AttendancePercentage details You Want");
        	 float  per = sc.nextFloat();
        	 System.out.println("Details Greater than "+per+"% are:");
        	 System.out.println();
        	 Percentage.getPercentage(per);
        	 System.out.println();
        	}
        	if(choice==4) {
        		System.out.println("Enter the MarkPercentage details You Want");
           	 float  per = sc.nextFloat();
           	System.out.println("Details Greater than "+per+"% are:");
       	    System.out.println();
           	PercentageMark .getMarkPercentage(per);
        	}
        	if(choice==5) {
        		System.out.println("Eligible To Write Exam:");
        		System.out.println("NOTE:");
        		System.out.println("Students Greater than 80% of Attendance are Eligible to Write Exam");
        		System.out.println();
        		ExamEligible.Exam();
        	}
        	if(choice==6) {
        		System.out.println("Below Students are not eligible to write Exam");
        		System.out.println();
        		NotEligible.NoExam();
        	}
        	}
    	}
    	catch(PasswordException e)
    	{
    		System.err.println(e.getMessage());
    	}
    }
    else if(ch=='S')
    {
    	
        	System.out.println("Student Access:");
        	System.out.println("Enter Name:");
        	sc.nextLine();
        	String name2=sc.nextLine();
        	System.out.println("Enter Password:");
        	String pas2=sc.nextLine();
        	try {
        	if(!StudentCheck.StudentProfile(name2,pas2)) {
        		
        		throw new PasswordException("**********Wrong Password**********");
        	}
        	else
        	{
        		
        		System.out.println("Login Successfull!!!");
        		System.out.println();
        		System.out.println();
        		StudentDetails.Details(name2);
        	}
        	}
        	catch(PasswordException e)
        	{
        		System.err.println(e.getMessage());
        	}
}
}
}


	
	


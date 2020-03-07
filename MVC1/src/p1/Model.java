package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Model {
	private String name;
	private String usn;
	private int marks1;
	private int marks2;
	private int marks3;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	public void setName(String name) {
		this.name = name;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public String getName() {
		return name;
	}
	public String getUsn() {
		return usn;
	}
	public int getMarks1() {
		return marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	
	public Model()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","human145");
			System.out.println("Connected");

		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Problem in loading the driver and connection");
		}
	}
	public void getResult()
	{
		try 
		{
			String s = "SELECT * FROM BTMABCSTUDENTS WHERE USN=?";
			pstmt = con.prepareStatement(s);
			pstmt.setString(1,usn);
			res = pstmt.executeQuery();
			while(res.next()==true)
			{
				name = res.getString(1);
				usn = res.getString(2);
				marks1 = res.getInt(3);
				marks2 = res.getInt(4);
				marks3 = res.getInt(5);
			}
		} 
		catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}

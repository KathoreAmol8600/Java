package PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

	
public class OperationOfPreperdStatmentInterface {
	private Connection conn;
	
	OperationOfPreperdStatmentInterface(Connection conn)
	{
		this.conn=conn;
	}
	
	Scanner sc = new Scanner(System.in);
	public void  insertDatainTable() throws SQLException
	{
		System.out.println("Enter the id and name or mark ");
		int id=sc.nextInt();
		String firstname=sc.next();
		int mark=sc.nextInt();
		PreparedStatement pstmt	=conn.prepareStatement("insert into student values(?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, firstname);
		pstmt.setInt(3, mark);
		int retref = pstmt.executeUpdate();
		if(retref>0)
		{
			System.out.println("yes operation got secsefulley");
		}else
		{
			System.out.println("operation dos not got secsefulley");
		}
//		System.out.println(retref);
		
	}
	
	public void showDataFromTable() throws SQLException
	{
		PreparedStatement pstmt = conn.prepareStatement("select * from student");
		ResultSet reset = pstmt.executeQuery();
		System.out.println("id \t name \t mark");
		while(reset.next())
		{
			System.out.println(reset.getInt(1)+"\t"+reset.getString(2)+"\t"+reset.getInt(3));
		}
	}
//	    using the cloues in preperedstetment interface\
	// select mark by ther using the id and name
	public void showdatausingcloues() throws SQLException
	{
		System.out.println("Enter the id and name");
		int id=sc.nextInt();
		String name=sc.next();
		PreparedStatement pstmt = conn.prepareStatement("select mark from student where id=? and firstname=?");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		ResultSet result=pstmt.executeQuery();
		if(result.next())
		{
			System.out.println("Studentv mark"+result.getInt(1));
		}else
		{
			System.out.println("no data found");
		}
	}
	
	public void selwctSecondHigestMark() throws SQLException
	{
	
		PreparedStatement pstmt = conn.prepareStatement("select max(mark) from student where mark<(select max(mark) from student)");
		
		ResultSet result=pstmt.executeQuery();
		if(result.next())
		{
			 int secondHighest=result.getInt(1);
			 System.out.println("Second highest salary is "+secondHighest);
		}else
		{
			System.out.println("no data found");
		}
	}
}

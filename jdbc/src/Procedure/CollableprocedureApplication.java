package Procedure;

import java.sql.*;


import com.mysql.cj.jdbc.CallableStatement;

import java.sql.Connection;

public class CollableprocedureApplication {

	public static void main(String[] args) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc", "root", "Pass@1234");
		if(conn !=null)
		{
			System.out.println("get connected");
			java.sql.CallableStatement cstmt=conn.prepareCall("{call savedata1(?,?,?)}");
			cstmt.setInt(1,20);
			cstmt.setString(2,"Zinta");
			cstmt.setInt(3,100);
			boolean bret = cstmt.execute();
			if(!bret)
			{
				System.out.println("Proceduer run");
			}else
			{
				System.out.println("proceduer not run");
			}
		}else
		{
			System.out.println("not get connected");
		}

	}

}

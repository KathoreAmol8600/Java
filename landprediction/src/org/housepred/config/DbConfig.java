package org.housepred.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbConfig {
 
	 
	protected Connection conn;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	public DbConfig()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/landprediction", "root", "Pass@1234");
			System.out.println(conn);
		} catch (Exception e) {
			
		}
	}
}

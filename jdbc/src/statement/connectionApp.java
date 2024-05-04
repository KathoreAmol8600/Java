package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Connection;
public class connectionApp {

	public static void main(String[] args) throws Exception{
//		// TODO Auto-generated method stub
	
		 com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
	     DriverManager.registerDriver(d);
	     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc","root","Pass@1234");
	     if(conn!=null)
	     {
	    	 System.out.println("Database connected Successfully......"+conn);
	    	 
	    	
	     }
	     else
	     {
	    	 System.out.println("Database not connected......");
	     } 
	
	     
}
}
	

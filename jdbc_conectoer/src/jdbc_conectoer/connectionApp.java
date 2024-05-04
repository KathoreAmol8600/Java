package jdbc_conectoer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
     com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
     DriverManager.registerDriver(d);
     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Pass@1234");
     if(conn!=null)
     {
    	 System.out.println("Database connected......");
     }
     else
     {
    	 System.out.println("Database not connected......");
     }
     
	}

}

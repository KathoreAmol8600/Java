package statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class OpearationWithUser 
{

	public static void main(String[] args) throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		
		com.mysql.cj.jdbc.Driver dref = new com.mysql.cj.jdbc.Driver();
	    DriverManager.registerDriver(dref);
	    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc", "root","Pass@1234");
	    if(conn!=null)
	    {
	    	System.out.println("Data Base Connected secsefulley");
	    	Statement stmt=conn.createStatement();
	    	if(stmt!=null)
	    	{
	    		System.out.println("statment create secsefulley");
	    		System.out.println("Enter the data for the three student");
	    		for(int i=0;i<3;i++)
	    		{	
	    			
		    		System.out.println("Enter the id , name , marks of the student");
		    		int id=sc.nextInt();
		    		String name=sc.next();
		    		int mark=sc.nextInt();
		    	    int ret	= stmt.executeUpdate("insert into student values("+id+",'"+name+"',"+mark+")");
		    		if(ret>0)
		    		{
		    			System.out.println("operation get secsefulley on qurey");
		    		}else
		    		{
		    			System.out.println("operation dosnot got secsfulley");
		    		}
	    		}
	    	}else
	    	{
	    		System.out.println("stetment not create secsefulley");
	    	}
	    }else
	    {
	    	System.out.println("database does not connected secsefulley");
	    }
	    
	}

}

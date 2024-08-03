package csvfileoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

import javax.annotation.processing.FilerException;

public class LoadCSVFileApplication 
{

	public static void main(String[] args) throws IOException, SQLException {
//		

	com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Pass@1234");
	if(conn!=null)
	{
		System.out.println("get connected secsefulley");
	    FileReader fr = new FileReader("C:\\Teck Giri\\Java Fullstack Developer\\java\\jdbc\\src\\csvfileoperation\\student.csv");
	    BufferedReader br = new BufferedReader(fr);
	    String line;
	    boolean b=false;
	    while((line=br.readLine())!=null)
	    {
	    	String []cols = line.split(",");
			cols=line.split(",");
			PreparedStatement stmt=conn.prepareStatement("insert into employee values(?,?,?)");
			stmt.setInt(1, Integer.parseInt(cols[0]));
			stmt.setString(2,cols[1]);
			stmt.setInt(3, Integer.parseInt(cols[2]));
			int value=stmt.ex;
	    	if(value>0)
	    	{
	    		b=true;
	    	}
	    }
	    if(b)
	    {
	    	System.out.println("file secsefulley load");
	    }else
	    {
	    	System.out.println("not load seccfulley");
	    }
	}else
	{
		
	}
		
 }

}

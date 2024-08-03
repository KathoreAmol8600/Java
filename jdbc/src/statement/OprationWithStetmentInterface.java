package statement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class OprationWithStetmentInterface {

//  case for insert dat
	int id=0;
	String name=null;
	int mark=0;
	Scanner sc = new Scanner(System.in);
	Statement stmt;
//	steatment interface use in it 
	OprationWithStetmentInterface(Statement stmt)
	{
		this.stmt=stmt;
	}
	
	OprationWithStetmentInterface()
	{
		
	}
	
 public int insertDataInSqlTable() throws SQLException 
 {
	 System.out.println("Enter the id name and marks");
	 id=sc.nextInt();
	 name=sc.next();
	 mark=sc.nextInt();
	 int retref=stmt.executeUpdate("insert into student values("+id+",'"+name+"',"+mark+")");
	 return retref;
 }
//case for delate data
 public int deleteDataInSqlTable() throws SQLException
 {
	 System.out.println("Enter the id for delate");
	 int id=sc.nextInt();    
	 int safeset=0;
	 boolean bret=stmt.execute("SET SQL_SAFE_UPDATES = 0"); 
	 System.out.println("bret->"+bret);
	
	 int retref=stmt.executeUpdate("delete from student where id="+id+";");
	 System.err.println("retuern"+retref);
//	 
	 return retref;
 }
 
// public int updateDataInSqlTable(Statement stmt) throws SQLException
//case for update dat
 public int updateDataInSqlTable() throws SQLException 
 {
	 System.out.println("Enter the id for the Update name and mark ");
	 int id=sc.nextInt();
	 System.out.println("Enter the new name and marks for update");
	 String name=sc.next();
	 int marks=sc.nextInt();
	 int retref = stmt.executeUpdate("update student set firstname='"+name+"', mark="+marks+" where id="+id+"");
	 return retref;
 }
 
 //show table from databases
 public int showTablefromdatabase() throws SQLException
 {
	 int ret=0;
	 System.out.println("Enter the Query");
	 String query = sc.nextLine();
	 ResultSet reset =stmt.executeQuery(query);
	 System.out.println("id"+"\t"+"name"+"\t\t"+"Marks");
	 while(reset.next())
	 {
		 
		System.out.println(reset.getInt("id")+"\t"+reset.getString("firstname")+"\t\t"+reset.getInt("mark"));
//		 System.out.println(reset.getInt("mark"));
		ret=1;
	 }
	 return ret;
 }

}

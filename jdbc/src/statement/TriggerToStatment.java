package statement;
import java.util.Scanner;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
public class TriggerToStatment {
   public static void main(String str[]) throws Exception
   {
	   Scanner sc = new Scanner(System.in);
		com.mysql.cj.jdbc.Driver  dref = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(dref);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc", "root","Pass@1234");
		int retnum1 =0;
		if(conn!=null)
		{
			System.out.println("connection istablished");
			Statement stmt=conn.createStatement();
			
			if(stmt!=null)
			{
				System.out.println("stetment created secsefulley");
//			    case for insert data
			    OprationWithStetmentInterface oponsqltable = new OprationWithStetmentInterface(stmt);
//			     retnum1 = oponsqltable.insertDataInSqlTable();
//			    case for delate data
//			     retnum1 = oponsqltable.deleteDataInSqlTable();
//			    case for update dat
//			     retnum1 = oponsqltable.updateDataInSqlTable();
			    retnum1 = oponsqltable.showTablefromdatabase();
				if(retnum1>0)
				{
					System.out.println("operation got secsefulley");
				}else
				{
					System.out.println("operation does not got secsefulley");
				}
			}else
			{
				System.out.println("not stetment created sucsefulley");
			}
		}else
		{
			System.out.println("Connection not ishtablised");
		}
		
   }
}

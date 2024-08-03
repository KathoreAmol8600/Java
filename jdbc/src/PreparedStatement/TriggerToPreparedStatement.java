package PreparedStatement;
import java.util.Scanner;

public class TriggerToPreparedStatement {

	public static void main(String[] args) throws SQLException
	{
		com.mysql.cj.jdbc.Driver  dref= new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(dref);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc", "root","Pass@1234");
		if(conn!=null)
		{
//			case1:insert into the data
			System.out.println("connection get secsefulley");
			OperationOfPreperdStatmentInterface operation_ps = new OperationOfPreperdStatmentInterface(conn);
//			operation_ps.insertDatainTable();
			
//          case2:show data
//			operation_ps.showDataFromTable();
//			case3: showdataUsingtheclouse
//			operation_ps.showdatausingcloues();
//			case:4 select secondhigest mark
			operation_ps.selwctSecondHigestMark();
			
		}else
		{
			
		}
	}

}

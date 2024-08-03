package resultsetmetadata;
import java.sql.*;
public class ResultSetMetaDataApplication {

	public static void main(String[] args) throws SQLException
	{
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc", "root", "Pass@1234");
		if(conn!=null)
		{
			PreparedStatement stmt=conn.prepareStatement("select *from student");
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int ncol=rsmd.getColumnCount();
			System.out.println("Count of number->"+ncol);
			for(int i=1;i<=ncol;i++)
			{
				String columnName = rsmd.getCatalogName(i);
				int colsize = rsmd.getColumnDisplaySize(i);
				String coulmnTypeName = rsmd.getColumnTypeName(i);
				System.out.println(columnName+"\t"+coulmnTypeName+"("+colsize+")");
			}
		}else
		{
			System.out.println("Database is not connected");
		}
	}

}

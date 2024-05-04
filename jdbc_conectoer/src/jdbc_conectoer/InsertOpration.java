package jdbc_conectoer;

public class InsertOpration
{

	public static void main(String[] args)
	{
		
		try {
		    // Load the JDBC driver class
		    Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		    // Handle exception if the driver class is not found
		    e.printStackTrace();
		}
	}

}

package operationwith.propertiesfile;
import java.io.*;
import java.util.*;
import java.sql.*;

public class LodingPropertiesFile {

	public static void main(String[] args) throws SQLException, IOException
	{
    File f = new File("");
    String path=f.getAbsolutePath();
    String path1=path.substring(0,path.length()-1);
//    System.out.println(path1);
    path1=path+"\\src\\resources\\db.properties.properties";
     System.out.println(path1);
//    FileInputStream fin = new FileInputStream("C:\\Teck Giri\\Java Fullstack Developer\\java\\jdbc\\src\\resources\\db.properties.properties");
		FileInputStream fin = new FileInputStream(path1);
    Properties p = new Properties();
    p.load(fin);
    String u = p.getProperty("db.username");
    String up = p.getProperty("db.password");
    String url = p.getProperty("db.url");
    String dclass = p.getProperty("db.driverClassName");
    System.out.println(u);
    System.out.println(up);
    System.out.println(url);
    System.out.println(dclass);
    
	}

}

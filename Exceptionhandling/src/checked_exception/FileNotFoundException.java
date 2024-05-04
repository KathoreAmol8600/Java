package checked_exception;
// io exception
import java.io.*;
import java.util.*;
public class FileNotFoundException {

	public static void main(String[] args)
	{
		try
		{
		File file = new File("Amol.txt");
		
		Scanner sc = new Scanner(file);
		}
		catch(Exception ref)
		{
			System.out.println("File not found"+ref.getMessage());
		}
	}

}

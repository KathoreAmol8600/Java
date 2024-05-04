package checked_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IoExceptionExzampal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reder = null;
		try
		{
		reder = new BufferedReader(new FileReader("dhdhd"));
		String line;
		while((line = reader.readLine())!= null)
		{
			System.out.println("line");
		}
		}catch(Exception e)
		{
			System.out.println("an errer occuerd"+e.getMessage());
		}finally
		{
			try
			{
				if(reader !=null)
				{
					reader.close();
				}
			}catch(Exception e)
			{
				System.out.println("Errer the closing the erere");
			}
		}
	}

}

package Filehandling;

import java.io.File;

public class fatchFileFromFolder {

	public void fatchFile( String path)
	{
		File f = new File(path);
		File list[] =f.listFiles();
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
	}
	
	public void fatchOnleyFile(String path)
	{
		File f = new File(path);
		File list[] =f.listFiles();
		System.out.println("this is onley File ");
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isFile())
			{
			System.out.println(list[i]);
			}
		}
	}
	
	public void fatchOnleyDirectoery(String path)
	{
		File f = new File(path);
		File list[] =f.listFiles();
		System.out.println("this is onley Directoer ");
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isDirectory())
			{
			System.out.println(list[i]);
			}
		}
		
     }
}

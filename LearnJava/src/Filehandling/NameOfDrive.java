package Filehandling;

import java.io.File;

public class NameOfDrive 
{
// listRoots();
	public void getOllDriveName()
	{
		File f[] = File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		
	}
	
}

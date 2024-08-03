package Filehandling;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class CreatInserRedData  {
    Scanner sc = new Scanner(System.in);
	public void createFolder(String path)
	{
		File f = new File(path);
	    // folder name in the path
		if(f.exists())
		{
			System.out.println("this file name  present in the file");
		}else
		{
			
			boolean b=f.mkdir();
			if(b)
			{
				System.out.println("Secsefulley file is the created....");
			}else
			{
				System.out.println("Secsefulley not file is the created....");

			}
		}
		
		
				
	}
	
	public void createFile(String path) throws IOException
	{
		File f = new File(path);
		boolean b = f.exists();
		if(b)
		{
			System.out.println("file is  exsti you can not create fie");
		
		}else
		{
       		boolean bret=f.createNewFile();
       		
			if(bret)
			{
				System.out.println("file is create secsesfulley");
			}
		}
	
	}
	
	public void wrtedatainfile(String path) throws IOException 
	{
		FileWriter fw = new FileWriter(path,true);
		System.out.println("Enter the data");
		String data=sc.nextLine();
		fw.write(data);
		fw.close();
		System.out.println("write secsefulley");
	}
	
	public void addNewLineData(String path) throws IOException 
	{
		FileWriter fw = new FileWriter(path,true);
		BufferedWriter  fnw = new BufferedWriter(fw);
		
		System.out.println("Enter the data");
		String data=sc.nextLine();
		fnw.write(data);
	    fnw.newLine();
	    fnw.close();
		fw.close();
		System.out.println("write secsefulley");
	}
	
	//br 1 char 
	public void readDataFromfile(String path ) throws IOException, InterruptedException
	{
		FileReader fr = new FileReader(path);
		int ch;
		while((ch=fr.read())!=-1)
		{
			if((char)ch=='f')
			System.out.print((char)ch);
			Thread.sleep(100);
		}
	}
	
	//by line by line 
	public void readDataFromfileLineByLine(String path ) throws IOException, InterruptedException
	{
		FileReader fr = new FileReader(path);
		BufferedReader fbr = new BufferedReader(fr);
		 String str;
		while((str=fbr.readLine())!=null)
		{
			
			System.out.println(str);
			Thread.sleep(100);
		}
	}
	
	// for the byte formate input and output stream classes
	public void writedatinByteFormate(String path) throws IOException
	{
		FileOutputStream fout = new FileOutputStream(path);
		System.out.println("Enter the Data");
		String data = sc.nextLine();
		byte byt[]=data.getBytes();
		fout.write(byt);
		fout.close();
		System.out.println("Data add secsefuley");
	}
	
//	public void readdataFromFileByteFormate(String path) throws IOException
//	{
//		FileInputStream finp = new FileInputStream(path);
//		int data;
//		while((data=finp.read())!=-1)
//		{
//			System.out.print((char)data);
//		}
//		
//	}
	
	public void readdataFromFileByteFormate(String path,String path1) throws IOException
	{
		FileInputStream finp = new FileInputStream(path);
		FileOutputStream fout = new FileOutputStream(path);
		int data;
		while((data=finp.read())!=-1)
		{
			fout.write(data);
		}
		fout.close();
		finp.close();
		System.out.println("Success.............");
	}
}

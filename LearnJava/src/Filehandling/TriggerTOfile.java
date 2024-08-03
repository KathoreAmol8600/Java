package Filehandling;
import java.util.*;

import java.io.*;
public class TriggerTOfile {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pathe of the file //file name at the end");
		String path = sc.nextLine();
//		C:\Teck Giri\Java Fullstack Developer\java
		NameOfDrive NameOfDrive = new NameOfDrive();
//		NameOfDrive.getOllDriveName();
		
		fatchFileFromFolder fatchfile = new fatchFileFromFolder();
//		fatchfile.fatchFile(path);              // oll file or folder
//		fatchfile.fatchOnleyFile(path);        // oll file
//		fatchfile.fatchOnleyDirectoery(path);  // oll folder

		
		CreatInserRedData opreationData  = new CreatInserRedData();
//		opreationData.createFolder(path);  // create folder
//		opreationData.createFile(path);    // create file
//		opreationData.wrtedatainfile(path);  // write data in file
//		opreationData.addNewLineData(path);  // add data in new line 
//		opreationData.readDataFromfile(path); // read  by char one by one
//		opreationData.readDataFromfileLineByLine(path);
		//byte formate
//		opreationData.writedatinByteFormate(path);
		System.out.println("Enter the path for save data ");
		String path1 = sc.nextLine();
		opreationData.readdataFromFileByteFormate(path,path1);
		
		
		

	}

}

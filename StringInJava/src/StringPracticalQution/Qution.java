package StringPracticalQution;
import java.util.*;
class Qution_string
{
	public void qution1_FindLengthOfString(String str)
	{
		int length=0;
		length=str.length();
		System.out.println("the length of string is->"+length);
	}
	
	public void qution2_CoppeyStringToAnother(String str)
	{
		String str2=new String(str);
		System.out.println("this is the new String ->"+str2);
	}
	public void qution3_ConcateString(String str,String str2)
	{
		String str3=str.concat( " "+str2);
		System.out.println("Strinc after the Concate-> "+str3);
		
	}
	
	public void  qution4_CompaerTwoString(String str, String str2)
	{
		int ret=str.compareTo(str2);
//		System.out.println(ret);
		if(ret==0)System.out.println("print are same");
	}
	
	public void qution5_ConvertUpperCase(String str)
	{
		String str2=str.toUpperCase();
		System.out.println("Aftert the Uppercase->"+str2);
		
	}
	
	public void qution6_ConvertLowerCase(String str)
	{
		String str2=str.toLowerCase();
		System.out.println("String str after the toLowerCase->"+str2);
	}
	
	public void qution7_toggalCase(String str)
	{
		char astr [] = str.toCharArray();
		for(int i=0;i<astr.length;i++)
		{
			if(astr[i]<='a'&&astr[i]>='z')
			{
				
			}
		}
	}
	
	
	
}
public class Qution
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		Qution_string Qution_string = new Qution_string();
//		Qution_string.qution1_FindLengthOfString(str);
//		Qution_string.qution2_CoppeyStringToAnother(str);
		
		// for cancate Enter the Second String
//		System.out.println("Enter the Second String");
//		String str2 = sc.next();
//		Qution_string.qution3_ConcateString(str, str2);s
//		Qution_string.qution4_CompaerTwoString(str, str2);
//		Qution_string.qution5_ConvertUpperCase(str);
//		Qution_string.qution6_ConvertLowerCase(str)
		Qution_string.qution7_toggalCase(str);
		

	}

}

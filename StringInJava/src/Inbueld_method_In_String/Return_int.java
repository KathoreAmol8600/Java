package Inbueld_method_In_String;
import java.util.*;
class inbueldStringMethoed
{
//	codePointAt() -> asscivalu retuern at index
	public int AssciValu_At_Indec_OfChar(String str,int index)
	{
		int result=str.codePointAt(index);
		return result;
	}
//  codePointBefore() -> return at befor the index
	public int assciValu_Befor_At_Indec_OfChar(String str , int index)
	{
		int result=0;
		result = str.codePointBefore(index);
		return result;
	}
//  codePointCount()  
	public int a_codePointCount(String str,int index1,int index2) 
	{
		int result=str.codePointCount(index1,index2);
		System.out.println(result);
		return 0;
	}
	
//  compareTo()	Compares two strings lexicographically
	public int compareTwoString(String str1,String str2)
	{
		int result=str1.compareTo(str2);
		return result;
	}

//	String compareToIgnoreCase()
	public int  compareStringIgnoringCase(String str,String str2)
	{
		int result =str.compareToIgnoreCase(str2);
		return result ;
	}
	
//	
}
public class Return_int
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Enter the second String");
		String str1 = sc.nextLine();
//		System.out.println("Enter the index");
//		int index=0;
//		index=sc.nextInt();
		inbueldStringMethoed inbueldStringMethoed = new inbueldStringMethoed();
		int result =0;
//		result=inbueldStringMethoed.AssciValu_At_Indec_OfChar(str,index);
//		System.out.println("Ascci value at index is->"+result);
//		
//		result=inbueldStringMethoed.assciValu_Befor_At_Indec_OfChar(str, index);
//		System.out.println("Ascci value at index is->"+result);
//		
//		inbueldStringMethoed.a_codePointCount(str, index, 2);
//		result=inbueldStringMethoed.compareTwoString(str, str1);
//		if(result==0)
//		{
//		System.out.println("string are same");
//		}else if(result>0)
//		{
//			System.out.println("Second String is Greater");
//		}else if(result<0)
//		{
//			System.out.println("first String is Greater");
//		}else
//		{
//			System.out.println("somthing is mismatch3");
//		}
		
		result=inbueldStringMethoed.compareStringIgnoringCase(str, str1);
		System.out.println(result);
		
		
		
		
		
		
     
	}

}

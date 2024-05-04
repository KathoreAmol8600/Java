package string;
import java.util.*;
public class OpreationOfString {
	
	
	public  void slpit(String str)
	{
		
		
	}
	
	public void checkPailendrom(String str)
	{
		int l=str.length();
		char [] arr = str.toCharArray();
		int length=str.length();
		char [] arr2= new char[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[length-1];
			length--; 
		}
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr2[i])
			{
				flag=false;
			}
		}
		
		if(flag)
		{
			System.out.println("this is the pailendrom string");
		}else
		{
			System.out.println("this is not pailendrom string");
		}
		 
	}
	
	
	public void checkCherectoer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr string ");
		String str;
		str=sc.nextLine();
	    int l=str.length();
	    char ch;
	    int alph=0,digit=0,spe_chara=0;
	   for(int i=0;i<l;i++)
	   {
		   ch=str.charAt(i);
		   if(ch>='0'&&ch<='9')
		   {
			   digit++;
		   }else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
		   {
			   alph++;
		   }else
		   {
			    spe_chara++;
		   }
		  
	   }
	   System.out.println("alph->"+alph);
	   System.out.println("alph->"+digit);
	   System.out.println("alph->"+spe_chara);
	   }
	
	
}

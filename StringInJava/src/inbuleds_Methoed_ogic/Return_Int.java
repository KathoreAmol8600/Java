package inbuleds_Methoed_ogic;
import java.util.*;
class A_inbuled_logic
{
	// return Asci Value at index of String
	public int a_codePointAt(String str,int index)
	{
		int asci=0;
		char sarr [] = str.toCharArray();
		char c = '\0';
		for(int i=0;i<sarr.length;i++)
		{
			if(i==index)
			{
				c=sarr[i];
				break;
			}
		}
		
		if(c>='a'&&c<='z')
		{
			asci=0;
			int i=97;
			for(char j='a';j<='z';j++)
			{
				i++;
				if(j==c)
				{
					asci=i;
					break;
				}
			}
			
			return --asci;
		}
		else if(c>='A'&&c<='Z')
		{
			asci=0;
			int i=65;
			for(char j='A';j<='Z';j++)
			{
				i++;
				if(j==c)
				{
					asci=i;
					break;
				}
			}
			
			return --asci;
		}
		else if(c>='0'&&c<='9')
		{
			asci=0;
			int i=48;
			for(char j='0';j<='9';j++)
			{
				i++;
				if(j==c)
				{
					asci=i;
					break;
				}
			}
			
			return --asci;
		}
		else
		{
			return -1;
		}
		
		
	}
	
	public void orederReversOfWard(String str)
	{
		char astr [] = str.toCharArray();
		int s=0;
		int e=0;
		char temp='\0';
		int j=astr.length;
		j=j-1;
		System.out.println("Length is->"+j);
		
		for(int i=0;i<astr.length/2;i++)
		{
			temp=astr[i];
			astr[i]=astr[j];
			
			j--;
		}
		
		String strnew= new String(astr);
		System.out.println("String is->"+astr);
		
	}
	
}


public class Return_Int
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the String ");
		String str = sc.nextLine();
//		System.out.println("Enter thr index for Ascivalue");
//		int index=0;
//		index=sc.nextInt();
		A_inbuled_logic ref = new A_inbuled_logic();
//		int result=0;
//		result=ref.a_codePointAt(str, index);
//		System.out.println("this is the Ascii value ->"+result);
		ref.orederReversOfWard(str);
				
	}

}

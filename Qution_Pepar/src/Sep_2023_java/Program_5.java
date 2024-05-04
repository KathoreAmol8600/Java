//Program 5. Write a program to input string and reverse the string without using any 
//inbuilt function? 

package Sep_2023_java;
import java.util.*;
public class Program_5 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String_length");
		String str=sc.nextLine();
		char[] str1=str.toCharArray();
		for(int i=0;i!='\0';i++)
		{
			System.out.println(str1[i]);
		}
	
	}

}

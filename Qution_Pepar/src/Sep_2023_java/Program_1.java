
//Program 1. Write program to create class name as CheckChar with two functions   
//void setChar(char ch): this function accept single character as input   
//boolean   checkChar(): this function can check character is alphabet or digit of special symbol if  
//character is alphabet or digit return true if character is digit then return false. 
package Sep_2023_java;

import java.io.Closeable;
import java.util.Scanner;

class checkChar
{
	char ch;
	void setChar(char ch)
	{
		this.ch=ch;
	}
	
	boolean checkChar()
	{
	
		if(ch>='a'&&ch<='z'||ch>'A'&&ch<'Z')   
		{
			return true;
		}else
		return false; 
	}
	
}

public class Program_1  
{

	public static void main(String[] args)
	{
		
		System.out.println("Enter the Chareacter");
		char ch='\0';
		Scanner sc =new Scanner(System.in);
		ch=sc.next().charAt(0);
		checkChar obj=new checkChar();
		obj.setChar(ch);
		boolean ret=false;
		ret=obj.checkChar();
		System.out.println("returen is ->"+ret);
		if(ret==true)
		{
			System.out.println("this is Alphbet");
		}else System.out.println("this is not Alphbet");
		

	}

}

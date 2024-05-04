package string;

import java.util.Scanner;

public class TriggerToString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		Write a Java program to find total number of alphabets, digits
//		or special character in a string.
		OpreationOfString OpreationOfString = new OpreationOfString();
//		OpreationOfString.checkCherectoer();
		
//      Write a Java program to check whether
//		a string is palindrome or not.
		
		System.out.println("Enter thr string "); 
		String str;
		str=sc.nextLine();
		OpreationOfString.checkPailendrom(str);
		
//      Write a Java program to reverse order of words 
//		in a given string./
		
	}

}

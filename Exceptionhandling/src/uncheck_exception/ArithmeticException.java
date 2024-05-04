package uncheck_exception;
import java.util.*;
public class ArithmeticException {

	public static void main(String[] args)
	{
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two Values");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=num1/num2;
		System.out.println("Divaidetion is ->"+num3);
		}catch(Exception e)
		{
			System.out.println("");
			
		}
	}

}

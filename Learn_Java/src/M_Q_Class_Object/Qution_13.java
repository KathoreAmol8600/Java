package M_Q_Class_Object;

public class Qution_13 {

	public static void main(String[] args)
	{
		
		System.out.println(myMethod(myMethod(new int[] {10,20}),myMethod(10,20)));
	}
    
	static int myMethod(int num1,int num2)
	{
		return 10;
	}
	
	static int muMethod(int...args)
	{
		return 20;
	}
	
}

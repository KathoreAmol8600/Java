package M_Q_Class_Object;

public class Qution_8 
{
	private static int num1=100;
	private int num2=200;
	
	// mymethode1
	public static void myMethod1()
	{
		num1=300;
		num2=400;
		System.out.println(num1+","+num2);
	}
	// mymethode2
	public static void myMethod2()
	{
		num1=300;
		Qution_8.num2=400;
	}
	//main methoed
	public static void main(String[] args)
	{
		Qution_8 q = new Qution_8();
		q.myMethod1();

	}

}

// in static methoed can decler onley static veribl

package M_Q_Class_Object;

public class Qution_7
{
//	 static int num1=100;
	public void myMethod1()
	{
		 static int num1=100;
		final int num2=200;
		System.out.println("the valu of the forsst varibal is"+num1);
		System.out.println("the valu of the forsst varibal is"+num2);
	}
	
	public void myMethod2()
	{
		int arr[]=new int[2];
		System.out.println(arr[arr.length-1]);
	}

	public static void main(String[] args) {
		new Qution_7().myMethod1();
		new Qution_7().myMethod2();
	}

}

// num_1 we can not create as static in 
// methoed is non static in that methoed we can not ceate veribal 
// as static 
package M_Q_Class_Object;

public class Qution_12 {

	public static void main(String[] args)
	{
		Qution_12 q = new Qution_12();
		q.myMethod(10, 20);
		q.myMethod(new long[]{});
		q.myMethod (new int[]{10,20,30,40,50}); 
	}
	
	void myMethod(short s1,short s2)
	{
		System.out.println("short");
	}
	
	void myMethod(int i1,int i2)
	{
		System.out.println("int");
	}
	
	void myMethod(int ...args)
	{
		System.out.println("intargs");
	}
	
}

// ther is no methoed for assepeting to array
// parmiter so compaill errrer

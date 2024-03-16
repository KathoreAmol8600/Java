package M_Q_Class_Object;

public class Qution_3 {

	public static void main(String[] args) 
	{
		int x=201;
		myMethod(x++);
		System.out.println(x);

	}
	
	static void myMethod(int x)
	{
		x%=10;
		System.out.println(x);
	}

}
// in above exzampal x =201 but after the ++ it 202
// and in my method id %10 and get 1
//Ans = 1 and 202
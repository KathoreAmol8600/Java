package Counstructoer;

class Demo
{
	Demo() // defoult counstructoer
	{
		System.out.println("inside the counstructoer");
	}
	
	Demo(int ino,int ino2)// parmitarsied counstructer
	{
		System.out.println("Addition is ->"+(ino+ino2));
	}
}

public class Syntex_Counstrucoer
{

	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		Demo obj1 = new Demo(2,3);
		
	}

}

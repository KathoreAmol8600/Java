package Counstructoer;

public class Overloded_counstrutoer {
	Overloded_counstrutoer()
	{
		System.out.println("inside the Defoult counstructoer");
	}
	
	// paramitersaied counstructoer
	Overloded_counstrutoer(int ino,int ino1)
	{
		System.out.println("Adddition is ->"+(ino+ino1));
	}
	// Overloded counstructoer
	Overloded_counstrutoer(int ino1)
	{
		System.out.println("inside the Overloded counstructoer ->"+(ino1));
	}
	
	public static void main(String[] args)
	{
		
		Overloded_counstrutoer obj1=new Overloded_counstrutoer();

		Overloded_counstrutoer obj2=new Overloded_counstrutoer(2,4);
		Overloded_counstrutoer obj3=new Overloded_counstrutoer(2);
		
		
		
	}

}

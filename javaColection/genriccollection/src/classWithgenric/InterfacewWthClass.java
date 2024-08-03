package classWithgenric;


interface Circle<E>
{
	public void setRedius(E e);
}

class Area implements Circle<Integer>
{
	public void setRedius(Integer e)
	{
		System.out.println("integer reduas"+e);
	}
}

class Cirm implements Circle<Float>
{
	public void setRedius(Float e)
	{
		System.out.println("integer reduas"+e);
		
	}
}

public class InterfacewWthClass {

	public static void main(String[] args) 
	{
		Area a = new Area();
		a.setRedius(123);
		
		Cirm  cm = new Cirm();
		cm.setRedius(10.5f);
		
	}

}

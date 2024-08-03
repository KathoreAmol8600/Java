package classWithgenric;

class Demo<E>
{
	public void show(E element )
	{
		System.out.println(element);
	}
}

class Data2<E>
{
	public void show(E element )
	{
		System.out.println(element);
	}
}
public class ConceptClassWithgenric {

	public static void main(String[] args) {
		Demo<Integer> obj = new Demo<Integer>();
		obj.show(100);
//		obj.show("aml"); -> string is not use ther
		
		Data2 <String>obj1 = new Data2<String>();
		obj1.show("amol");

	}

}

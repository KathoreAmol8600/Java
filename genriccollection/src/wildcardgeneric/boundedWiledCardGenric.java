package wildcardgeneric;

import java.util.ArrayList;
import java.util.List;
class A
{
	public void show()
	{
		System.out.println("i am a show methoed");
	}
}
class B extends A
{
	
}
class Demo1
{
	void acceptValues(List<? super B> list)
	{
		A a1 =(A)list.get(0);
		a1.show();
	}
}
public class boundedWiledCardGenric {

	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		A al = new A();
		List<A> list = new ArrayList<A>();
		list.add(al);
		d.acceptValues(list);
		
	}

}

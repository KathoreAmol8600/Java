package wildcardgeneric;

import java.util.ArrayList;
import java.util.List;

class Demo
{
	void acceptValue(List<? extends Number> list1)
	{
		for(Object obj:list1)
		{
			System.out.println(obj);
		}
	}
}
public class UnboundedwiledCard {

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("integer list ");
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		d.acceptValue(list);
		
		System.out.println("list of float data");
		List<Float> list1 = new ArrayList<Float>();
		list1.add(12.4f);
		list1.add(23.4f);
		list1.add(54.45f);
		d.acceptValue(list1);
		
	}

}

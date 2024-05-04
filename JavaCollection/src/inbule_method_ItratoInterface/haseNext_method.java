package inbule_method_ItratoInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class haseNext_method {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
//		Iterator i =list.iterator();
		
		System.out.println("size vectoer->"+list.size());
	   // isEmptey()
		boolean b = list.isEmpty();
		
		if(b==true) System.out.println("emptey");
		else System.out.println(" not emeptey");
		//contains();
		if(list.contains(10)) System.out.println("yes");
		else System.out.println(" no");
		
		b=list.remove(10);
		System.out.println(b);
		
		 // hasNext()
//		while(i.hasNext())
//		{
//			// next()
//			Object obj=i.next();
//			System.out.println(obj);
//		}
		
		
		
	}

}

package COM.VECTOR;
import java.util.*;

//i?mport javax.lang.model.element.Element;
public class serchkey {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
//		Iterator i = v.iterator();
//		 boolean f = false;
//		Enumeration  e = v.elements();
		
//		while(e.hasMoreElements())// cheack data present on elemennt
		
//		while(i.hasNext())// cheack element present
		ListIterator l =v.listIterator(0);
		
	//	while(l.hasNext())
		for(Object obj:v)
		{
//			Object obj =l.next();
			System.out.println(obj);
		}
	}
}
package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

 class MethoedOfMapInterface
{
	public void putObject(LinkedHashMap m)
	{
		System.out.println("add Elemnt");
		m.put(1, "amol");
		m.put(2, "ramesh");
		m.put(3, "ravi");
		m.put(4,"kavita");
	
	}
	
	public void showObject(LinkedHashMap m)
	{
		System.out.println("all Elemnt");
		System.out.println(m);
	}
	public void getObjectFromIndex(LinkedHashMap m)
	{
		System.out.println("get elemnt by id");
		int index=1;
		Object obj=m.get(index);  // restrive oll keys from map list
		if(obj!=null)
		{
			System.out.println("data found here...");
		}else
		{
			System.out.println("Data not found");
		}
		
	}
	
	public void remoObject(LinkedHashMap m)
	{
		System.out.println("remove elemnt by id");
		int index=1;
		Object obj=m.remove(index);
		System.out.println(obj);
	}
	
	public void checkKeyFound(LinkedHashMap m)
	{
		System.out.println("check key");
		int key=2;
	   Boolean b =m.containsKey(m);
	   if(b)
	   {
		   System.out.println("found it");
	   }else
	   {
		   System.out.println("Not found it");
	   }
	}
	
	public void checkValueINMap(LinkedHashMap m)
	{
		System.out.println("object check in it");
		boolean val = m.containsValue("ravi");
		if(val)
		   {
			   System.out.println("found it");
		   }else
		   {
			   System.out.println("Not found it");
		   }
	}
	
	// fatch the oll data from map]
	public void fatchollkeysFromMap(LinkedHashMap m)
	{
		System.out.println("oll key of the map");
		Set keys=m.keySet();
		Iterator i =keys.iterator();
		
		while(i.hasNext())
		{
			Object key = i.next();
			System.out.println(key);
		} 
	}
	
	// fatch oll values from map
	public void fatchOllValues(LinkedHashMap m)
	{
		System.out.println("oll values from ,map");
		Collection value = m.values();
		Iterator elemnt=value.iterator();
		while(elemnt.hasNext())
		{
			Object obj = elemnt.next();
			System.out.println(obj);
		}
		
	}
	
	public void setGetFunction(LinkedHashMap m)
	{
		Set<Map.Entry>s=m.entrySet();
		for(Map.Entry m1 : s)
		{
			System.out.println(m1.getKey()+"...."+m1.getValue());
		}
		
	}
}
 
 
public class DiffrentMethoed { 
	
	public static void main(String[] args) 
	{
		MethoedOfMapInterface obj = new MethoedOfMapInterface();
		LinkedHashMap m = new LinkedHashMap();
		obj.putObject(m);
		obj.showObject(m);
		obj.getObjectFromIndex(m);
		obj.remoObject(m);
		obj.checkKeyFound(m);
		obj.checkValueINMap(m);
		obj.fatchollkeysFromMap(m);
		obj.fatchOllValues(m);
		obj.setGetFunction(m);
		
   }
	
	
}

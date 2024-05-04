package listmethod;

import java.util.*;

public class GetElemntIndex 
{
	public void getElemntByIndex(ArrayList list,Scanner sc)
	{
		
		System.out.println("Enter the index");
		int index=sc.nextInt();
		Object obj=list.get(index);
		
		System.out.println("this is the element->"+obj);
		
		
		
	}
	
}

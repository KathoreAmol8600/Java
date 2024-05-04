package listmethod;
import java.util.*;
public class DispleyList 
{
   public void displeyList( ArrayList list)
   {
	   Iterator  i = list.iterator();
	   
	   while(i.hasNext())
	   {
		   Object obj=i.next();
		   System.out.println(obj);
	   }
   }


}

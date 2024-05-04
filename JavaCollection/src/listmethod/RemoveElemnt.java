package listmethod;
import java.util.*;
public class RemoveElemnt {
  public void RemoveingElemntAtIndex(ArrayList list)
  {
	  Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the index for remove");
	 int index=sc.nextInt();
	 Object obj=list.remove(index);
	 System.out.println(obj);
  }
}

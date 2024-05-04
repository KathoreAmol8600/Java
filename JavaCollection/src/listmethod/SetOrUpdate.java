package listmethod;
import java.util.*;
public class SetOrUpdate {
	public void updateValu(ArrayList list)
	{
		Scanner sc = new Scanner(System.in);
		int index =0;
		int elemnt =0;
		System.out.println("enter the Index and Elemnt");
		index=sc.nextInt();
		elemnt=sc.nextInt();
		list.set(index,elemnt);
		
	}
}

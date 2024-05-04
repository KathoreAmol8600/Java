package listmethod;
import java.util.*;
public class IndexOfPerticulerElemnt 
{
	public int IndexOfPerticulerElemnt(ArrayList list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elemnt");
		int Elemnt=sc.nextInt();
		int ret =list.indexOf(Elemnt);
		return ret;
	}
}

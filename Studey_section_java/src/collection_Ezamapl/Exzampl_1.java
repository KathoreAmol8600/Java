package collection_Ezamapl;
import java.util.*;
//3) Write a Java program to associate the specified value with the specified key in a 
//HashMap.(Take an Integer as key and Fruit name as value).
//And search Specific value is present or not
public class Exzampl_1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ListIterator iterator = list.listIterator();
		System.out.println("amol");
		while (true) 
		{
			 Object obj = iterator.previous();
			  System.out.println(obj);
			}
		
	}

}

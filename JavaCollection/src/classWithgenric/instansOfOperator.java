package classWithgenric;

import java.util.ArrayList;

public class instansOfOperator {

	public static void main(String[] args) {
		
		ArrayList list =new ArrayList();
		list.add(10);
		list.add("amol");
		list.add(30);
		list.add(40);
		list.add(40.5f);
		list.add(50);
		
		int sum=0;
		for(Object obj:list)
		{
			if(obj instanceof Integer)  // to avoide classs cast exseption
			sum=sum+(Integer)obj;
		}
		System.out.println("sum is ->"+sum);
	}

}

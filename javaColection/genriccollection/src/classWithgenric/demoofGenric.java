package classWithgenric;

import java.util.ArrayList;


//case -->
//public class demoofGenric {
//
//	public static void main(String[] args) {
//
//		ArrayList <Integer>list =new ArrayList();
//		list.add(10);
////		list.add("amol");
//		list.add(30);
//		list.add(40);
////		list.add(40.5f);
//		list.add(50);
//		
//		int sum=0;
//		for(Object obj:list)
//		{
//			if(obj instanceof Integer)  // to avoide classs cast exseption
//			sum=sum+(Integer)obj;
//		}
//		System.out.println("sum is <Genric>->"+sum);
//
//	}
//
//}


//case -->2
//public class demoofGenric {
//
//	public static void main(String[] args) {
//
//		ArrayList <Integer>list =new ArrayList<Integer>();
//		list.add(10);
////		list.add("amol");
//		list.add(30);
//		list.add(40);
////		list.add(40.5f);
//		list.add(50);
//		
//		int sum=0;
//		for(Integer obj:list)
//		{
//			
//			sum=sum+obj;
//		}
//		System.out.println("sum is <Genric>->"+sum);
//
//	}


//case-->3  using the difrant data 
class Data
{
	private int id;
	private String name;
	private float per;
	//defoult counstructoer
	public Data()
	{
		
	}
	
	//paramitersied counstructoer
	public Data(String name,int id,float per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	
}
public class demoofGenric {

	public static void main(String[] args) {

		Data obj1 =new Data("xyz1",1,14.4f);
		Data obj2 =new Data("xyz2",2,24.4f);
		Data obj3 =new Data("xyz2",3,34.4f);
		Data obj4 =new Data("xyz3",4,44.4f);
		
		ArrayList <Data>list =new ArrayList<Data>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj3);
		list.add(obj4);
		for(Data d:list)
		{
			System.out.println("the id is->"+d.getId());
		}
	}

}

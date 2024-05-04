package arraylistexzampal;
import java.util.*;
public class ProductApplicationUsingArrayList 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		Product pobj1 = new Product();
		
		pobj1.setId(1);
		pobj1.setName("Tv");
		pobj1.setPrice(10000);
		
		Product pobj2 = new Product();
		pobj2.setId(2);
		pobj2.setName("fan");
		pobj2.setPrice(2000);
		
		Product pobj3 = new Product();
		pobj3.setId(3);
		pobj3.setName("chaier");
		pobj3.setPrice(3000);
		
		Product pobj4 = new Product();
		pobj4.setId(4);
		pobj4.setName("cooler");
		pobj4.setPrice(40000);
		

		Product pobj5 = new Product();
		pobj5.setId(5);
		pobj5.setName("table");
		pobj5.setPrice(5000);
		
		list.add(pobj1);
		list.add(pobj2);
		list.add(pobj3);
		list.add(pobj4);
		list.add(pobj5);
		
		Iterator i = list.iterator();
		System.out.println("Enter the index");
	    int pid=sc.nextInt();
		
		while(i.hasNext()) 
		{
			Object obj=i.next();
			Product p=(Product)obj;
			System.out.println(p.getId()+"\t"+p.getName()+
					"\t"+p.getPrice());
		
		}
		boolean flag=false;
		
		for(Object obj:list)
		{
			Product p=(Product)obj;
			if(p.getId()==pid)
			{
				int index=list.indexOf(p);
				if(index!=-1)
				{
					list.remove(index);
					flag=true;
					break;
				}
			}
		}
		
		if(flag==true)
		{
			System.out.println("secseesfulley delated....");
			System.out.println("despleying aftr delate");
			for(Object obj:list)
			{
				Product p=(Product)obj;
				System.out.println(p.getId()+"\t"+p.getName()+
						"\t"+p.getPrice());
			}
			
		}
		
	}

}

class Product
{
	private int id;
	private String name;
	private long price;
	
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
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
}
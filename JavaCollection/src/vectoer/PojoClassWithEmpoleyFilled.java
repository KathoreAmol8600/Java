package vectoer;
import java.util.*;


public class PojoClassWithEmpoleyFilled 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		Employe emp1 =  new Employe();
		emp1.setId(1);
		emp1.setName("Amol");
		emp1.setSal(10000);
		
		Employe emp2 =  new Employe();
		emp2.setId(2);
		emp2.setName("Ganesh");
		emp2.setSal(20000);
		
		Employe emp3 =  new Employe();
		emp3.setId(3);
		emp3.setName("Rahual");
		emp3.setSal(30000);
		
		Employe emp4 =  new Employe();
		emp4.setId(4);
		emp4.setName("Kartik");
		emp4.setSal(40000);
		
		Employe emp5 =  new Employe();
		emp5.setId(1);
		emp5.setName("Amol");
		emp5.setSal(10000);
		
		v.add(emp1);
		v.add(emp2);
		v.add(emp3);
		v.add(emp4);
		v.add(emp5);
		
		Iterator i =v.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			Employe e=(Employe)obj;
//			if(e.getId()==3)
			System.out.println(e.getId()+"\t"+e.getName()+"\t"
					+e.getSal());
		}
		
	}
}

class Employe
{
	private int id;
	private String name;
	private long sal;
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
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	
	
	
}

package counstructoerabstractInterface;

class Salary
{
	String name;
	int id;
	String contact;
	int presentDeys;
	int perdaySalary;
	int totalSalry;
	int num=10;
	Salary(String name,int id,String contact,int presentDeys,int perdaySalary)
	{
		this.name=name;
		this.id=id;
		this.contact=contact;
		this.presentDeys=presentDeys;
		this.perdaySalary=perdaySalary;
	}
	
	public void calculateSalary()
	{
	    totalSalry=presentDeys*perdaySalary;
		System.out.println("this is the totalsalaery->"+totalSalry);
		
	}
	
	public void SalaryApp()
	{
		System.out.println("name-"+name+"\t"+"id-"+id+"\t"+"contact-"+contact+"\t"+"totalSalry-"+totalSalry);
	
	}
	
	
}
public class Exzampal_2 {

	public static void main(String[] args) 
	{
		Salary Sobj = new Salary("ganesh",1,"8699984365",15,300);
		Sobj.calculateSalary();
		Sobj.SalaryApp();
		

	}

}

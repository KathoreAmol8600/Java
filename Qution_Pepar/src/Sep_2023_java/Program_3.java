
//rogram 3. Write program to Create class name as PersonalInfo with parameterized 
//constructor PersonalInfo(String name, String middlename, String lastname) and you have to 
//create class name as ProfessionalInfo with parameterized constructor like as 
//ProfessionalInfo(int id,String des,int salary,String skillset) and you have to inherit 
//PersonalInfo class in ProfessionalInfo and pass parameter from ProfessionalInfo class to 
//PersonalInfo using super() constructor and you have to define void show() method in 
//ProfessionalInfo and you have to show the all data in show() method 

package Sep_2023_java;

class PersonalInfo
{
	String name;
	String middlename;
	String lastname;
	
	public PersonalInfo(String name,String middlename,String lastname)
	{
		this.name=name;
		this.middlename=middlename; 
		this.lastname=lastname;
	}
	
	
}

class ProfessionalInfo extends PersonalInfo
{
	int id;
	String des;
	int salary;
	int sallset;
	
	public ProfessionalInfo(int id,String des,int salary,String skillset,String name,String middlename,String lastname)
	{
		super(name, middlename,lastname); 
		
		this.id=id;
		this.des=des;
		this.salary=salary;
		this.sallset=sallset;
		
	}
	 
	void show()
	{
		System.out.println("name\tmiddlename\tlastname id\tdes\tsallset\tsalary"); 
		System.out.println(name+"\t"+middlename+"\t"+lastname+" "+id+"\t"+des+"\t"+sallset+"\t"+salary);
	}
}

public class Program_3 
{
	public static void main(String[] args)
	{
		String name="Amol";
		String middlename="Rameshwar";
		String lastname="kathore";
		int id = 1;
		String des="engniner";
		int salary=2000;
		String skillset="Java";
		ProfessionalInfo obj1 = new ProfessionalInfo(id,des,salary,skillset,name,middlename,lastname);
		obj1.show();
		
	}

}

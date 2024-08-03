package Map_mini_project;
import java.util.*;


public class Student_ararylist<E > {
	Scanner sc=new Scanner(System.in);
	public void Addnewstudent(int totalstudent ,pojo_studentlist arrlab[], LinkedHashMap map) 
	{
//		Scanner sc=new Scanner(System.in);
		
		
			arrlab[totalstudent]=new pojo_studentlist();
			
			System.out.println("Enter the student Id:");
			arrlab[totalstudent].setId(sc.nextInt());
			
			System.out.println("Enter the student name:");
			arrlab[totalstudent].setName(sc.next());
			
			System.out.println("Enter the course name:");
			arrlab[totalstudent].setCname(sc.next());
			
			System.out.println("Enter the book total fees:");
			arrlab[totalstudent].setTotalfees(sc.nextInt());
			
			System.out.println("Enter the total duration :");
			arrlab[totalstudent].setDuration(sc.nextInt());	
			
//			student.add(arrlab[totalstudent]);
			System.out.println("Enter the prn number");
			String key = sc.next();
			map.put(key, arrlab);
			
	
	}
	
	public void displeyStudent(pojo_studentlist arrlab[], LinkedHashMap map)
	{
		Set keys=map.keySet();
		int num=0;
		Iterator i = keys.iterator();
		while(i.hasNext())
		{
			Object key =i.next();
			System.out.println("prnNumber->"+key);
			pojo_studentlist[] value = (pojo_studentlist[]) map.get(key);
			
			System.out.println("id->"+value[num].getId());
			System.out.println("name->"+value[num].getName());
			System.out.println("course_name->"+value[num].getCname());
			System.out.println("dueration->"+value[num].getDuration());
			System.out.println("total_fees->"+value[num].getTotalfees());
//			System.out.println(""+value[num]);
			System.out.println("\n");
			num++;
		}
	}
	
	public void searchStudentByName(pojo_studentlist arrlab[], LinkedHashMap map)
	{
		System.out.println("in search");
		Set keys=map.keySet();
		int num=0;
		Iterator i = keys.iterator();
		System.out.println("Enter the name");
		String sName=sc.next();
		while(i.hasNext())
		{
			Object key =i.next();
//			System.out.println("prnNumber->"+key);
			pojo_studentlist[] value = (pojo_studentlist[]) map.get(key);
			
			if(sName.equals(value[num].getName()))
			{
				System.out.println("prnNumber->"+key);
				
			System.out.println("id->"+value[num].getId());
			System.out.println("name->"+value[num].getName());
			System.out.println("course_name->"+value[num].getCname());
			System.out.println("dueration->"+value[num].getDuration());
			System.out.println("total_fees->"+value[num].getTotalfees());
		
//			System.out.println(""+value[num]);
			System.out.println("\n");
			}
			num++;
		}
	}

}

package studentfunction;
import studentpojo.pojo_studentlist;
//1. Student new student data 
//2. View All Student Data
//3. Search Student data by name 
//4. Search Student by PRN
//5. Delete Student by CourseName
//6. Find the course wise student data
//7. Find the course wise student count
//8. Arrange Student count course wise in descending order
import java.util.*;
import java.util.Map.Entry;

public class Student_ararylist<E >{
	
	Scanner sc=new Scanner(System.in);
	// map2
	LinkedHashMap<String, Integer> map2 = new LinkedHashMap<String,Integer>();
	
	public LinkedHashMap returnmap2()
	{
		return map2;
	}
	
	public void Addnewstudent(int totalstudent ,pojo_studentlist arrlab[], LinkedHashMap map) 
	{
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
//			System.out.println("prnNumber->"+key);
			pojo_studentlist[] value = (pojo_studentlist[]) map.get(key);
			System.out.println("prnNumber->"+key+"\n"+"id->"+value[num].getId()+"\n"+"name->"+value[num].getName()+"\n"+"course_name->"+value[num].getCname()
					+"\n"+"dueration->"+value[num].getDuration()+"\n"+"total_fees->"+value[num].getTotalfees());
					System.out.println("\n");
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
		boolean flag=false;
		while(i.hasNext())
		{
			Object key =i.next();
			pojo_studentlist[] value = (pojo_studentlist[]) map.get(key);
			
			if(sName.equals(value[num].getName()))
			{
				flag=true;
				System.out.println("prnNumber->"+key+"\n"+"id->"+value[num].getId()+"\n"+"name->"+value[num].getName()+"\n"+"course_name->"+value[num].getCname()
						+"\n"+"dueration->"+value[num].getDuration()+"\n"+"total_fees->"+value[num].getTotalfees());
						System.out.println("\n");
			            System.out.println("\n");
			}
			num++;
		}
		if(flag==false)
			System.out.println("no data found");
		
	}
	
	//4. Search Student by PRN
	public void searchStudentByPrn(pojo_studentlist arrlab[], LinkedHashMap map)
	{
		System.out.println(" Search Student by PRN");
		Set keys=map.keySet();
		int num=0;
		Iterator i = keys.iterator();
		System.out.println("Enter the prn");
		String u_prn=sc.next();
		boolean flag=false;
		while(i.hasNext())
		{
			Object key =i.next();
			if(u_prn.equals(key))
			{
		    	pojo_studentlist[] value = (pojo_studentlist[]) map.get(key);
				flag=true;
				System.out.println("prnNumber->"+key+"\n"+"id->"+value[num].getId()+"\n"+"name->"+value[num].getName()+"\n"+"course_name->"+value[num].getCname()
				+"\n"+"dueration->"+value[num].getDuration()+"\n"+"total_fees->"+value[num].getTotalfees());
				System.out.println("\n");
	            System.out.println("\n");
			}
			num++;
		}
		if(flag==false)
			System.out.println("no data found");
	}
	
	//6. Find the course wise student data
	public void findCourseWiseStudent(pojo_studentlist arrlab[], LinkedHashMap map)
	{
		System.out.println("search by course couese");
		Set keys=map.keySet();
		int num=0;
		Iterator i = keys.iterator();
		System.out.println("Enter the Coursename");
		String corsename=sc.next();
		boolean flag=false;
		while(i.hasNext())
		{
			Object key =i.next();
//			System.out.println("prnNumber->"+key);
			pojo_studentlist[] value = (pojo_studentlist[]) map.get(key);
			
			if(corsename.equals(value[num].getCname()))
			{
				flag=true;
				System.out.println("prnNumber->"+key+"\n"+"id->"+value[num].getId()+"\n"+"name->"+value[num].getName()+"\n"+"course_name->"+value[num].getCname()
						+"\n"+"dueration->"+value[num].getDuration()+"\n"+"total_fees->"+value[num].getTotalfees());
						System.out.println("\n");
			            System.out.println("\n");
			}
			num++;
		}
		if(flag==false)
			System.out.println("no data found");
		
	}
	//5. Delete Student by CourseName
		public void deleteStudentByCourseName(pojo_studentlist arrlab[], LinkedHashMap map)
		{
			System.out.println("search by course name");
			Set keys=map.keySet();
			int num=0;
			Iterator i = keys.iterator();
			System.out.println("Enter the Coursename");
			String cs_name=sc.next();
			boolean flag=false;
			Object tempkey=null;
			while(i.hasNext())
			{
				Object key =i.next();
//				System.out.println("prnNumber->"+key);
				pojo_studentlist[] value = (pojo_studentlist[]) map.get(key);
				
				if(cs_name.equals(value[num].getCname()))
				{
					tempkey=key;
					
					flag=true;
				}
				num++;
			}
			if(flag==false)
				System.out.println("no data found,not remove");
			else
			{
				Object retval=map.remove(tempkey);
				this.displeyStudent(arrlab, map);
				System.out.println("remove secsefulley");
			}
		}
		
		//7. Find the course wise student count
		
		public void countCourseWiseStudent(pojo_studentlist arrlab[], LinkedHashMap map)
		{
		
			System.out.println("search by count coursewise student");
			Set keys=map.keySet();
			int num=0;
			Iterator i = keys.iterator();
//			System.out.println("Enter the Coursename");
//			String cs_name=sc.next();
			boolean flag=false;
			int num1=0;
			Integer count=0;
			// retrive couerse
			while(i.hasNext())
			{
				
				Object key =i.next();
				pojo_studentlist[] value = (pojo_studentlist[]) map.get(key);
				
				String course=value[num].getCname();
				count=0;
				num1=0;
				Iterator j = keys.iterator();
				// loop for count course
				while(j.hasNext())
				{
					Object key1 =j.next();
//					System.out.println("prnNumber->"+key);
					pojo_studentlist[] value1 = (pojo_studentlist[]) map.get(key);
					String course1=value1[num1].getCname();
//					System.out.println("course is for check ->"+course1);
					if(course.equals(course1))
					{
						count++;
					}	
					num1++;
				}
					map2.put(course, count);
					flag=true;
					num++;
			}
			
			// if nodata found
			if(flag==false)
				System.out.println("no data found");
			else // show data
			{
				Set <Map.Entry<String, Integer>>set = map2.entrySet();
				for(Map.Entry<String, Integer> m:set)
				{
					System.out.println("course->"+m.getKey()+"\tcountis->"+m.getValue());
				}
			}
			
		}
		//8. Arrange Student count course wise in descending order
		public void desendingOrder(pojo_studentlist arrlab[], LinkedHashMap map)
		{
		    // Sort the map2 by value in descending order
	        List<Map.Entry<String, Integer>> list = new LinkedList<>(map2.entrySet());
	        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
	        
	        // Put the sorted entries back into a LinkedHashMap
	        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
	        for (Map.Entry<String, Integer> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        // Print the sorted map
	        Set<Map.Entry<String, Integer>> set = sortedMap.entrySet();
	        for (Map.Entry<String, Integer> m : set) {
	            System.out.println("course->" + m.getKey() + "\tcountis->" + m.getValue());
	       
		}
    }	
}  

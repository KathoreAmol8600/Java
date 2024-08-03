package Student;
import java.util.*;

import studentfunction.Student_ararylist;
import studentpojo.pojo_studentlist;

//Perform following operation on above map.
//1. Student new student data 
//2. View All Student Data
//3. Search Student data by name 
//4. Search Student by PRN
//5. Delete Student by CourseName
//6. Find the course wise student data
//7. Find the course wise student count
//8. Arrange Student count course wise in descending order

public class StudentApp 
{
	public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
	{
			Scanner sc=new Scanner(System.in);
			pojo_studentlist arrlab[]=new pojo_studentlist[100];
			LinkedHashMap<String, Student_ararylist<?>> map = new LinkedHashMap<String, Student_ararylist<?>>();
//			ArrayList<String> student=new ArrayList<String>();
			Student_ararylist strlab=new Student_ararylist();
			int totalstudent=-1;
			int choice=0;
			do 
			{
				
				
				System.out.println("Enter 1 for add new Student data:");
				System.out.println("Enter 2 for show new Student data:");
				System.out.println("Enter 3 for  Search Student data by name :");
				System.out.println("Enter 4 for  Search Student by PRN :");
				System.out.println("Enter 5 for  Delete Student by CourseName:");
				System.out.println("Enter 6 Find the course wise student data:");
				System.out.println("Enter 7 Find the course wise student count:");
				System.out.println("Enter 8  Arrange Student count course wise in descending order:");
				
				System.out.println("Enter the user choice:");
				int uchoice=sc.nextInt();
				
				switch(uchoice) 
			{
				case 1:
				{
					if(totalstudent<=99)
					{
					totalstudent++;
					strlab.Addnewstudent(totalstudent, arrlab, map);
					}else
					{
						System.out.println("Space not Avelable........");
					}
					break;
				}
				case 2:
					if(totalstudent!=-1)
					{
					 strlab.displeyStudent(arrlab, map);
					}else
					{
						System.out.println("ther are no aney data");
					}
					break;
				case 3:
					if(totalstudent!=-1)
					{
					 strlab.searchStudentByName(arrlab, map);
					}else
					{
						System.out.println("ther are no aney data");
					}
					break;
				case 4:
//					 Search Student by PRN
					if(totalstudent!=-1)
					{
					 strlab.searchStudentByPrn(arrlab, map);
					}else
					{
						System.out.println("ther are mo  aney data");
					}
					break;
				case 5:
//					 Delete Student by CourseName
					if(totalstudent!=-1)
					{
					 strlab.deleteStudentByCourseName(arrlab, map);
					 totalstudent--;
					}else
					{
						System.out.println("ther are mo  aney data");
					}
					break;
				case 6:
//					Find the course wise student data
					if(totalstudent!=-1)
					{
						
						strlab.deleteStudentByCourseName(arrlab, map);
					}else
					{
						System.out.println("ther are mo  aney data");
					}
//					
					break;
				case 7:
//					. Find the course wise student count/
					if(totalstudent!=-1)
					{
						strlab.countCourseWiseStudent(arrlab, map);
					}else
					{
						System.out.println("ther are mo  aney data");
					}
					
					break;
					
				case 8:
//					Arrange Student count course wise in descending order.
					if(totalstudent!=-1)
					{
						strlab.desendingOrder(arrlab, map);
					}else
					{
						System.out.println("ther are mo  aney data");
					}
					
					break;
					
				default:
				{
					System.out.println("Invalid choice:");
				}
			}
				System.out.println("Enter 0 for Exit and Enter 1 for continue:");
				choice=sc.nextInt();
				if(choice==0) 
				{
					System.out.println("Thanks for the visit Library....................");
				}
				
				else 
				{
					System.out.println("...................Welcome to the Library......................");
				}
				
			}while(choice!=0);
	}
  }

}

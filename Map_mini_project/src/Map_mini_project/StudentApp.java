package Map_mini_project;
import java.util.*;


public class StudentApp {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		pojo_studentlist arrlab[]=new pojo_studentlist[100];
		LinkedHashMap<String, Student_ararylist<?>> map = new LinkedHashMap<String, Student_ararylist<?>>();
//		ArrayList<String> student=new ArrayList<String>();
		Student_ararylist strlab=new Student_ararylist();
		int totalstudent=-1;
		int choice=0;
		
		do 
		{
			System.out.println("Enter 1 for add new Student:");
			
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
					System.out.println("ther aney data");
				}
				break;
			case 3:
//				if(totalstudent!=-1)
//				{
				strlab.searchStudentByName(arrlab, map);
//				}else
//				{
//					System.out.println("ther aney data");
//				}
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

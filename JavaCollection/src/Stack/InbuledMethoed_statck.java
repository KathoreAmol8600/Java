package Stack;
import java.util.*;
public class InbuledMethoed_statck
{
	Scanner sc = new Scanner(System.in);
   public void pushElemnt(Stack stack)
   {
	   System.out.println("Enterrd the Elemnt in Stack");
	   int Elemnt=sc.nextInt();
	   int Elemnt1=sc.nextInt();
	   int Elemnt2=sc.nextInt();
	   int Elemnt3=sc.nextInt();
	   
	   stack.push(Elemnt);
	   stack.push(Elemnt1);
	   stack.push(Elemnt2);
	   stack.push(Elemnt3);
	   
   }
   
   public void showElemntOfStack(Stack stack)
   {
	   Iterator i = stack.iterator();
	   System.out.println("this is the elemnt in the stack");
	   while(i.hasNext())
	   {
		   Object obj = i.next();
		   System.out.println(obj);
	   }
   }
   
   public void popElemnt(Stack stack)
   {
	   System.out.println("dkkdkd");
   }
   
   public void peek_topmostElemnt()
   {
	   
   }
   
   public void isEmpteyCheck()
   {
	  
					
   }
	
	
	
}

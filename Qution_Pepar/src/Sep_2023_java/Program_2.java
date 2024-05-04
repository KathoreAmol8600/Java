//Program 2. Write Program create class name as ArrSum with method void setValue(int arr[]) 
//you have to create child class name as GetSum with method  int getArrSum() you have to accept 
//array values from ArrSum and calculate its sum and return it 

package Sep_2023_java;
import java.util.*;
class ArrSum
{
	 int arr[];
	public void setValue(int arr[])
	{
		this.arr=arr;
	}
	
	public int getArrSum()
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
}
public class Program_2 {  

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=0;
		size=sc.nextInt();
		
	    int arr[]=new int[size];
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    ArrSum ref=new ArrSum();
	    ref.setValue(arr);
	    int ret=0;
	    ret=ref.getArrSum();
	    System.out.println("this is the sum os arry-> "+ret);
	    
		

	}

}

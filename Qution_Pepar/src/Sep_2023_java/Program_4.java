//Program 4.  Write a Program to perform method overriding you have to create class name as 
//ArrParent with method   
//void setValue(int arr[]): this method can accept array as parameter   
//void arrangeSeq(): this method can display array as per user input sequence  
//You have to create two child class name as ArrangeAscendingOrder and you have to inherit  
//ArrParent class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort 
//array and display in ascending order and you have to create one more class name 
//ReverseArray and override arrangeSeq() method from ArrParent and reverse array and 
//display it. 

package Sep_2023_java;

import java.util.Scanner;

class ArrParent
{
	 int arr[];
	 void setValue(int arr[])
	 {
		 this.arr=arr;
	 }
	 void arrangeSeq()
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	 }
	 
	 int[]  getaddres()
	 {
		 return arr;
	 }
}
 class ArrangeAscendingOrder extends ArrParent
 {
	
	 void arrangeSeq()
	 {
		 // asending order
		 int temp=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
	 }
	 
     void  displey()
     {
    	 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
     }
 }
 
 class ReverseArray extends ArrParent
 {
	
	 void arrangeSeq()
	 {
		 // asending order
		
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 System.out.println(arr[i]);
		 }
     }
 }
 
public class Program_4 {

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
	    
	    ArrangeAscendingOrder obj = new ArrangeAscendingOrder();
	    obj.setValue(arr);
	    obj.arrangeSeq();
	    obj.displey();
	    
	    ReverseArray obj2 = new ReverseArray();
	    obj2.setValue(arr);
	    obj2.arrangeSeq();
	    
	    

	}

}

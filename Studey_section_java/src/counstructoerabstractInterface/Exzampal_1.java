
//Suppose you have a Piggie Bank with an initial amount of $50 and you have to 
//add some more amount to it. Create a class 'AddAmount' with a data member 
//named 'amount' with an initial value of $50. Now make two constructors of this 
//class as follows: 1 - without any parameter - no amount will be added to the 
//Piggie Bank 2 - having a parameter which is the amount that will be added to 
//Piggie Bank Create object of the 'AddAmount' class and display the final 
//amount in Piggie Bank.
package counstructoerabstractInterface;
import java.util.*;
class AddAmount
{
	private int amount=850;
	AddAmount()
	{
		System.out.println("current amount is->"+amount);
	}
	
	AddAmount(int amount)
	{
		System.out.println("current amount is->"+this.amount);
		System.out.println("current adding amount is->"+amount);
		this.amount=amount+this.amount;
		System.out.println("After adding amount is->"+this.amount);
		
	}
	
	
}

public class Exzampal_1
{
     
	public static void main(String[] args) {
//		AddAmount obj = new AddAmount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount for the Add");
		int amount=sc.nextInt();
		AddAmount obj = new AddAmount(amount);
	}

}

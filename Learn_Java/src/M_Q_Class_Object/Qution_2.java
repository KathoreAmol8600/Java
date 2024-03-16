package M_Q_Class_Object;

public class Qution_2 {

	int eval(int []...vars)
	{
		int sum=0,b,c;;
		for(b=0;b<vars.length;b++)
		{
			for(c=0;c<vars[b].length;c++)
			{
				sum+=vars[b][c];
			}
		}
		return (sum);
	}
	public static void main(String[] args) {
		
		Qution_2 varargs = new Qution_2();  // obj creation
		int sum=0;
		sum=varargs.eval(new int[] {10,20,30,40},new int[]{40,50,60});
		System.out.println("the sum of the number is:"+sum);
	}

}

// in above exzampal two arraay as a pairmiter ti function
 //  and using the for loo ther logic for to sum of twodey arra
//Ans-> 250

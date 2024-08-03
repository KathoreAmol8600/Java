package QutionPepoer;

public class QutionNumber
{
	
	public void Qution_one()
	{
		char A='A';
		char a='a';
		for(int i=1;i<=5;i++)
		{
			a='a';
			A='A';
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					if(i%2!=0)
					{
					System.out.print(A);
					A++;
					}else
					{
						System.out.print(a);
						a++;
					}
				}else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	public void Qution_two()
	{
		char A='A';
		int num=1;
		char star='*';
		for(int i=1;i<=5;i++)
		{
			A='A';
			 num=1;
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					if(i==1||i==4)
					{
					System.out.print(star);
				
					}else if(i==2||i==5)
					{
						System.out.print(num);
						num++;
					}else if(i==3)
					{
						System.out.print(A);
						A++;
					}
					
				}else
				{
					System.out.print(" ");
				}
				
			}
			num++;
			A++;
			System.out.println();
		}
		
		for(int i=4;i>=1;i--)
		{
			A='A';
			 num=1;
			for(int j=i;j>=1;j--)
			{
				if(j<=i)
				{
					if(i==1||i==4)
					{
					System.out.print(star);
				
					}else if(i==2||i==5)
					{
						System.out.print(num);
						num++;
					}else if(i==3)
					{
						System.out.print(A);
						A++;
					}
					
				}else
				{
					System.out.print(" ");
				}
				
			}
			num++;
			A++;
			System.out.println();
		}
	}
	
//	 Write a program to find the duplicate numbers from Array by using Map Collection?
	public void Qution_3()
	{
		int arr[8]= {"12"};
	}
}

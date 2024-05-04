package Pattern;

public class Center_Tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		char alp='A';
		for(int i=0;i<9;i++)
		{
			alp='A';
			for(int j=0;j<17;j++)
			{
				if(flag==true)
				{
					if((j>=8-i)&&(j<=8+i))
					{
						System.out.print(" "+alp+" ");
						alp++;
						flag=false;
					}else
					{
						System.out.print("   ");
					}
				}else
				{
					System.out.print("   ");
					flag=true;
				}
				
			}
			System.out.println();
		}
	}

}

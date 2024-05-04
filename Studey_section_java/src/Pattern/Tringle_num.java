package Pattern;

public class Tringle_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		for(int i=0;i<7;i++)
		{
			
			for(int j=0;j<7;j++)
			{
				if(j<=i)
				{
				System.out.print(" "+num+" ");
				num++;}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}

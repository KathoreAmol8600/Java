package Pattern;
//* 
//*  * 
//*  *  * 
//*  *  *  * 
//*  *  *  *  * 
public class Left_Tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			
			for(int j=0;j<6;j++)
			{
				if(j>=6-i)
				System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}

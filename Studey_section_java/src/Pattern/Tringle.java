package Pattern;
//* 
//*  * 
//*  *  * 
//*  *  *  * 
//*  *  *  *  * 
//*  *  *  *  *  * 
public class Tringle {

	public static void main(String[] args) {
//		for(int i=0;i<6;i++)
//		{
//			
//			for(int j=0;j<6;j++)
//			{
//				if(j<=i)
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		char alp='A';
		for(int i=0;i<9;i++)
		{
			alp='A';
			for(int j=0;j<9;j++)
			{
				if(j<=i)
				System.out.print(" "+alp+" ");
				alp++;
			}
			System.out.println();
		}
		
	}

}

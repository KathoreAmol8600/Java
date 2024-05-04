package Array;

public class AnynomasArrray
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		Addition.sum(new int[] {1,2,3,4});
	}

}
class Addition
{
	public static void sum(int[] a)
	{
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			total=total+a[i];
		}
		System.out.println("total is the "+total);
	}
}

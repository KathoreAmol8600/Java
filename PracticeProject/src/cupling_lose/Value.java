package cupling_lose;

public abstract class Value
{
	int a,b;
	public void setvalue(int x,int y)
	{
		a=x;
		b=y;
	}
	abstract int getResult();	
}

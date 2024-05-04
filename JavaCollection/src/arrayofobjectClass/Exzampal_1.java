package arrayofobjectClass;

public class Exzampal_1 {

	public static void main(String[] args) {
		Object obj[] = new Object[5];
		obj[0]="good";
		obj[1]=500;
		obj[2]=false;
		obj[3]=5.4f;
		obj[4]=new java.util.Date();
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
	}

}

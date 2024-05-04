package counstructoer_in_string;

public class Create_Same_String {

	public static void main(String[] args) {
		char name [] = {'a','m','o','l'};
		String str = new String(name);
		System.out.println("String name is ->"+str);
		String str2=new String(str);
		System.out.println("after the Cretion String is");
		System.out.println("String is->"+str2);

	}

}

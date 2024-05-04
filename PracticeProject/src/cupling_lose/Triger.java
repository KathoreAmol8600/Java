package cupling_lose;

public class Triger {

	public static void main(String[] args) {
		
		Calculeter Calculeter= new Calculeter();
		Value v = new Add();
		v.setvalue(10,20);
		Calculeter.perfromOperation(v);
		v=new mul();
		v.setvalue(3, 4);
		Calculeter.perfromOperation(v);
	}

} 

package cupling;

public class TrigerToCalculeter {

	public static void main(String[] args) {
		Calculeter Calculeter = new Calculeter();
		Add add = new Add();
		add.setValue(10,20);
		Calculeter.perfromOperation(add);
		
		Mul mul = new Mul();
		mul.setValue(3, 5);
//		Calculeter.perfromOperation(mul);
//		this is the Tight type of the Coupling
	}

}

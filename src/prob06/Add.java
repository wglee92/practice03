package prob06;

public class Add implements Arithmetic {

	private int a;
	private int b;
	
	public int calculate() {
		return a + b;
	}
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
}

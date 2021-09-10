package oops;

class Calc{
	int n1 = 100;
	int n2 = 200;
	int result;
	
	public void perform() {
		result = n1 + n2;
	}
}

public class DemoObj {

	public static void main(String[] args) {
		Calc obj = new Calc();
//		obj.n1 = 10;
//		obj.n2 = 40;
		
		obj.perform();
		System.out.println(obj.result);
	}

}

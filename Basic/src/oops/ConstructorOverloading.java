package oops;

class Calcy{
	int n1, n2;
	
	public Calcy() {
		n1 = 100;
		n2 = 200;
		System.out.println("Constructor with Default Value");
	}
	
	public Calcy(int i, int j) {
		n1 = i;
		n2 = j;
		System.out.println("Constructor with Dynamic Integer Value");
	}
	
	public Calcy(double i, double j) {
		n1 = (int)i;
		n2 = (int)j;
		System.out.println("Constructor with Dynamic Double Value");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Calcy obj1 = new Calcy();
		Calcy obj2 = new Calcy(10,20);
		Calcy obj3 = new Calcy(1.1, 2.2);
	}

}

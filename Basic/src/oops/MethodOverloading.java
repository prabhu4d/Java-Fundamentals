package oops;

class AddCalcy{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void add(double a, double b) {
		System.out.println(a+b);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		AddCalcy obj = new AddCalcy();
		
		obj.add(10, 10);
		obj.add(20, 30, 40);
		obj.add(10.10, 20.20);
	}

}

package operators;

public class Basic {
	/**
	 * 
	 * Arithmetic
	 * Bitwise
	 * Relational
	 * Logical
	 * 
	 * */
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Arthmetic Operations");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((double)a/b);
		System.out.println(10%7);
		
		System.out.println("++ / --");
		int m = 5, n = 10;
		m = n++; // Assign and Increment
		System.out.println(m);
		m = ++n; // Increment and Assign
		System.out.println(m);
	}

}

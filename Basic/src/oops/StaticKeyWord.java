package oops;

class Emp{
	int id;
	int salary;
	// ceo variable is common for all the objects
	static String ceo;
	
	// static block only run when class loads
	static {
		ceo = "BOSS";
		System.out.println("In STATIC");
	}
	
	// Constructor Run whenever you create an object
	public Emp(int id, int salary) {
		this.id = id;
		this.salary = salary;
		System.out.println("In Constructor");
	}
	
	public void show() {
		System.out.println(id + " : " + salary + " : " + ceo);
	}
}

public class StaticKeyWord {

	public static void main(String[] args) {
		Emp prabhu = new Emp(1, 20000);
//		prabhu.id = 1;
//		prabhu.salary = 20000;
//		prabhu.ceo = "Boss";
		
		Emp ammu = new Emp(2, 30000);
//		ammu.id = 2;/
//		ammu.salary = 30000;
		
		prabhu.show();
		ammu.show();
		
		ammu.ceo = "Leader";
		prabhu.show();
		ammu.show();
	}

}

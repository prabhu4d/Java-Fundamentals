package Basic.src.oops;

/*
* Inner Class
* 	1. Member Class - Object Type
* 	2. Static Class
* 	3. Anonymous Class
* */

class Outer{
	// Member Variable
	int a = 100;

	// Member Method
	public void show() {
		System.out.println("Outer Class, a is " + a);
	}

	// Inner Class
	// Member Class
	class Inner{ // filename - Outer$Inner.class
		public void display(){
			System.out.println("Inner class display");
		}
	}

	static class StaticInner{
		public  void display(){
			System.out.println("Static Inner Class Display");
		}
	}
}

public class InnerClassDemo {
	// variable, method
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();

		// Object Initialization Syntax
		// ClassName object_name = new ObjectConstructor
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();

		Outer.StaticInner obj2 = new Outer.StaticInner();
		obj2.display();
	}

}

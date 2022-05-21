package Basic.src.oops;


class A{
    public A(){
        System.out.println("Class A Constructor");
    }

    public A(int i){
        System.out.println("Class A Parameterized Constructor");
    }

    public A(String name){
        System.out.println("Class A --> " + name);
    }
}

class B extends A{
    public B(){
        // super(); default
        System.out.println("Class B Constructor");
    }

    public B(int i){
        // to call super class parameterized constructor
        // super(i);
        System.out.println("Class B Parameterized Constructor");
    }

    public B(String name){
        super(name);
        System.out.println("Class B -> " + name);
    }
}

public class SuperMethod {
    public static void main(String[] args){
        /*
        * While creating an object of subclass it calls the super class default constructor
        *
        * If we create with parameters also, it calls super class default constructor, not
        * parameterized constructor
        * */
        B obj = new B();

        B obj2 = new B(10);

        B name = new B("Super Method");
    }
}

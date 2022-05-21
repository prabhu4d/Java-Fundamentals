package Basic.src.oops;

/*
* NEED: we can refer the abstract class for any objects which extends the abstract class
*
* AbstractClass objectName = new SubClassExtendsAbstractClass;
*
* */


// Abstract Class
abstract class Human{
    abstract public void eat(); // Abstract method

    public void walk(){

    }
}

class Man extends Human{ // Concrete class
    public void eat(){
        System.out.println("Eat method in Man Class");
    }
}

public class Abstract {

    public static void main(String[] args){
        Human adam = new Man();
        adam.eat();
    }
}

package oops;

interface Writer{
    // every variable assignment is final in interface
    String type = "COLOR";
    void write();

    // In > Java 1.8 supports methods definition in interface
    default void scan(){
        System.out.println("Scanning ... in Writer");
    }

    // no need an object to call info for static method,
    // we can directly call using interface name
    static void info(){
        System.out.println("HP Writer");
    }
}

interface Scanner{
    default void scan(){
        System.out.println("Scanning ... in Scanner");
    }
}

class Pen implements Writer, Scanner{
    public void write(){
//        type = "B&W";
        System.out.println("Pen is Writing");
    }

    /*
    * Pen inherits Writer, Scanner
    * When we call scan() there is an ambiguity issue
    *
    * To Solve
    *  we need to Override or Call the Super class method
    *
    * */

    @Override
    public void scan(){
        Scanner.super.scan();
    }
}

class Pencil implements Writer{
    public void write(){
        System.out.println("Pencil is Writing");
    }
}

public class Interface {
    /*
    * Java doesn't support multiple inheritance
    * To Achieve Generalization we go for Interface
    *
    *
    * Interface is next level to Abstract class
    *
    * In Abstract class there is
    *   1. Declaration
    *   2. partial definition
    *
    * In Interface there is only declaration no definition
    *
    * Types
    * 1. Normal - more methods
    * 2. Single abstract methods - functional interface - lambda expression
    * 3. Marker Interface - no methods
    *
    * */

    public static void main(String[] args) {

        Writer pen = new Pen();
        Writer pencil = new Pencil();

        pen.write();

        Writer lambda = () -> System.out.println("Lambda Expression for Implementing functional interface");
        lambda.write();

        pen.scan();
        Writer.info();
    }
}

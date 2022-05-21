package Basic.src.oops;

import java.util.Optional;

class Phone{
    public void show(){
        System.out.println("Phone is Electronic Device to Communicate");
    }
}

class Samsung extends Phone{
    public void show(){
        System.out.println("Samsung is a Phone");
    }

    public void camera(){
        System.out.println("105 MP");
    }
}

class MI extends Phone{
    public void show(){
        System.out.println("MI is Phone");
    }
}

public class DynamicMethodDispatch {

    // Compile & Runtime Polymorphism
    public static void main(String[] args){
        // create a Samsung object with reference of Phone
        Phone s22 = new Samsung(); // runtime polymorphism
        s22.show();
        // s22 is Samsung object, but it referenced to Phone Class
        // so JVM only looks methods in Phone, but executes Samsung methods
        // s22.camera();

        s22 = new MI();
        s22.show(); // Dynamic Method Dispatch
    }
}

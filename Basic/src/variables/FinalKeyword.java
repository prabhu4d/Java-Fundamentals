package Basic.src.variables;

class Math{
    int radius = 10; // is variable
    final double PI = 3.14; // constant you can't change after assignment

    final double distance;

    Math(double distance) {
        this.distance = distance;
    }

    final public double circumference(Integer radius){
        return 2 * PI * radius;
    }
}

class Calculus extends Math{

    Calculus(double distance) {
        super(distance);
    }
    // final method can't be override
//    public double circumference(Integer radius){
//        return 2 * PI * radius;
//    }
}


// Final class can't be inherited
final class Photon{
    public double speed(){
        return 100000000;
    }
}

//class Laser extends Photon{
//
//}

public class FinalKeyword {
    public static void main(String[] args){
        Math m1 = new Math(10000);
//        m1.distance = 100; // you can't change the final variable
    }
}

package Basic.src.oops;

// HAS-A
class BasicCalc{ // Super Class
    public int add(int a, int b){
        return a + b;
    }
}

// Single Level Inheritance
// IS-A
class AdvancedCalc extends BasicCalc{ // Sub Class
    public int sub(int a, int b){
        return a - b;
    }
}

// Multilevel Inheritance
// IS-A
class VeryAdvCalc extends AdvancedCalc{
    public int mul(int a, int b){
        return a * b;
    }
}

public class Inheritance {

    public static void main(String[] args){
        AdvancedCalc calc = new AdvancedCalc();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.sub(10, 20));

        VeryAdvCalc vobj = new VeryAdvCalc();
        System.out.println(vobj.mul(10, 20));
    }
}

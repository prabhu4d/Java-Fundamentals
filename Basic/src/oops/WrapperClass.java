package Basic.src.oops;

public class WrapperClass {
    public static void main(String[] args) {
        int num1 = 5; // Primitive DataType, num1 is primitive
        Integer num2 = new Integer(5); // Wrapper Class, num2 referencing object of Integer 5

        Integer num3 = new Integer(num1); // Boxing || Wrapping
        int num4 = num3.intValue(); // unboxing || Unwrapping

        Integer num5 = num1; // Auto Boxing
        // Integer num5 = new Integer(num1)

        int num6 = num5; // AutoUnBoxing

        /*
        * Primitive Types are faster than Wrapper Class
        * Then why we need Wrapper Class
        *    - so framework only support wrapper class
        *       - Hibernate, Collection API
        *
        *
        * */

        String logic = "123";
        int num123 = Integer.parseInt(logic);
        System.out.println(num123);
    }
}

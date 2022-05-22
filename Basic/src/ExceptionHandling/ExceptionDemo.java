package Basic.src.ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args){
        try {
            int n1 = 10;
            int n2 = 1;
            int div = n1 / n2;

            int[] numbers = new int[5];
            numbers[5] = 10;
            System.out.println("Result -> " + div);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array limit exceeds ...");
        }
        catch (Exception e){
            System.err.println("Error -> " + e);
        }
        finally {
            System.out.println("Finally Executed");
        }
    }
}

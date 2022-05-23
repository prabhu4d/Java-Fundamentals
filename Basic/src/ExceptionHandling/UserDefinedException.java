package ExceptionHandling;

class ZeroException extends Exception{
    public ZeroException(String message){
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args){
        int i = 10;
        int j = 11;

        try{
            int k = i/j;
            if(k==0){
                throw new ZeroException("Oh no, Value is Zero");
            }
            System.out.println("K -> " + k);
        }
        catch (ZeroException ze){
            System.err.println("Error -> " + ze.getMessage());
        }
    }
}

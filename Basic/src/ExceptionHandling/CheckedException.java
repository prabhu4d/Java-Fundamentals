package Basic.src.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
    /*
    * if exception errors shows in compile time is called checked exception
    *
    * */

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number : ");

        int n = 0;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
        }
        catch (Exception e){
            System.out.println("Error -> "+ e);
        }
        finally {
            br.close();
        }
        System.out.println("Number is ->" + n);

    }
}

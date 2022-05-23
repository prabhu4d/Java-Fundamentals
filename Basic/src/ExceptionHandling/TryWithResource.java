package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResource {
    public static void main(String[] args) throws Exception{
        System.out.println("Try with Resource");
        System.out.println("Enter a number : ");

        int n = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            n = Integer.parseInt(br.readLine());
        }

        System.out.println("N = " + n);
    }
}

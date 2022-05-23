package IO;

import java.util.Scanner;

public class ScaningInput {
    /*
    * Using Scanner we don't need to write
    * try except & type conversion
    * */

    public static void main(String[] args){
        System.out.println("Scanner");
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("n -> " + n);
    }
}

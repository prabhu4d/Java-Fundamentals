package Iteration;

public class EnhancedLoop {
  public static void main(String[] args) {
    System.out.println("Enhanced Loop");

    int a[] = { 1, 2, 3, 4 };

    for (int k : a) {
      System.out.println(k);
    }

    // Enhanced For Loop for 2D Array
    int array[][] = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    for (int row[] : array) {
      for (int col : row) {
        System.out.print(" " + col);
      }

      System.out.println();
    }
  }
}
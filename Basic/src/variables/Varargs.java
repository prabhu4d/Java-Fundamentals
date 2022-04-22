package variables;

class Calc {
  public int add(int... n) {
    // typeof n is Array
    int sum = 0;
    for (int k : n) {
      sum += k;
    }
    return sum;
  }
}

public class Varargs {
  // Variable Length Arguments

  public static void main(String[] args) {
    Calc obj = new Calc();
    System.out.println(obj.add(10, 20, -10));
  }
}

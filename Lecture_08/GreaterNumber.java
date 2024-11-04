import java.util.*;

public class GreaterNumber {
  public static int greater(int a, int b) {
    if (a > b) return a;
    return b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print("Greater number is: " + greater(a, b));
  }
}
import java.util.*;

public class Sum2 {
  public static void main(String[] args) {
    System.out.println("Enter value of a: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("Enter value of b: ");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.print("Sum: ");
    System.out.print(sum);
  }
}
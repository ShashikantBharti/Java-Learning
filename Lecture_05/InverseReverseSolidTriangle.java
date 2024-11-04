import java.util.*;

public class InverseReverseSolidTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of triangle: ");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++) {
      // Print Spaces
      for(int j = 1; j < i; j++) {
        System.out.print("  ");
      }

      // Print Stars
      for(int j = 1; j <= n - i + 1; j++) {
        System.out.print("* ");
      }

      // New Line
      System.out.println();
    }
  }
}
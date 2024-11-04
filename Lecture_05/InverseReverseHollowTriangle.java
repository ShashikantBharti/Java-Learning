import java.util.*;

public class InverseReverseHollowTriangle {
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
        if(i == 1 || i == n || j == 1 || j == n - i + 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }

      // New Line
      System.out.println();
    }
  }
}
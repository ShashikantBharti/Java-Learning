import java.util.*;

public class InverseHollowTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of triangle: ");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++) {
      // Print Spaces
      for(int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }

      // Print Star
      for(int j = 1; j <= i; j++) {
        if(i == 1 || i == n || j == 1 || j == i) {
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
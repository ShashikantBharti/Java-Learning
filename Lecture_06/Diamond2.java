import java.util.*;

public class Diamond2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of pyramid: ");
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      // Spaces
      for(int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }

      // Stars
      for(int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }

    // Lower
    for(int i = n - 1; i >= 1; i--) {
      // Spaces
      for(int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }

      // Stars
      for(int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
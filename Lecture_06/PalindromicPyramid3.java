import java.util.*;

public class PalindromicPyramid3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of pyramid: ");
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      // Spaces 
      for(int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
     
      for(int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }

      for(int j = 2; j <= i; j++) {
        System.out.print(j + " ");
      }

      System.out.println();
    }
  }
}
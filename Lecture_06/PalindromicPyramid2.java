import java.util.*;

public class PalindromicPyramid2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of pyramid: ");
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      // Spaces 
      for(int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }

      // Number
      int counter = 1;
      boolean flag = true;
      for(int j = 1; j <= 2 * i - 1; j++) {
        System.out.print(counter + " ");
        if(flag && counter < i) {
          counter++;
        }
        else counter--;
        if(counter == i) flag = false;
      }
      System.out.println();
    }
  }
}
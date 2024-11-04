import java.util.*;

public class PalindromicPyramid {
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
      int counter = i;
      boolean flag = true;
      for(int j = 1; j <= 2 * i - 1; j++) {
        System.out.print(counter + " ");
        if(flag && counter > 1) {
          counter--;
        }
        else counter++;
        if(counter == 1) flag = false;
      }
      System.out.println();
    }
  }
}
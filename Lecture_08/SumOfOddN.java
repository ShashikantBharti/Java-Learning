import java.util.*;

public class SumOfOddN {

  public static int sumOfOddNumbers(int n) {
    int sum = 0;
    while(n > 0) {
      if(n % 2 == 0) {
        sum = sum + n;
      }
      n--;
    }
    return sum;
  } 

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    System.out.print("Sum of first " + n + " Odd integers is: " + sumOfOddNumbers(n));
  }
  
}
import java.util.*;

class Main {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int[][] matrix = new int[3][3];

    // Taking Input
    // Row
    for(int i = 0; i < 3; i++) {
      // Columns
      for(int j = 0; j < 3; j++) {
        System.out.print("Enter value for (" + i + "," + j +"): ");
        matrix[i][j] = sc.nextInt();
        sc.nextLine();
      }
    }

    // Printing Matrix
    // Rows
    for(int i = 0; i < 3; i++) {
      // Columns
      for(int j = 0; j < 3; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }


  }
}
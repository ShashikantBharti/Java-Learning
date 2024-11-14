import java.util.Scanner;

class Main {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    shape(n);

    int[] marks = new int[4];
    marks[0] = 95;
    marks[1] = 91;
    marks[2] = 93;
    marks[3] = 98;

    String[] subjects = {"Maths", "English", "Science", "Computer"};

    System.out.println(subjects[0] + " : " + marks[0]);
    System.out.println(subjects[1] + " : " + marks[1]);
    System.out.println(subjects[2] + " : " + marks[2]);
    System.out.println(subjects[3] + " : " + marks[3]);

    // Printing array using loops
    for(int i = 0; i < marks.length; i++) {
       System.out.println(subjects[i] + " : " + marks[i]);
    }
    
    
    
    
  }

  //   1. Custom Shape n = 5
  // 
  //                   *
  //                   * *
  //     e e e e e e e * * *
  //     e      n+2    * *
  //     e             *
  //     e
  //     e n+4
  //     e
  //     e
  //     e
  //     e
  // * * * * *
  public static void shape(int n) {
    // Return if number is even or less than 3
    if (n % 2 == 0 || n < 3) {
      System.err.println("Error: Number must be odd and greater than 1");
      return;
    }
    // 1. First Part Above Horizontal Line
      // Row 1 to (int)n/2
      for(int i = 1; i <= (int)n/2; i++) {
        // Print Space from 1 to (int)n/2 + n+2
        for(int j = 1; j <= (int)n/2 + (n+2); j++) {
          System.out.print("  ");
        }
        // Print Star from 1 to noOfRows
        for(int j = 1; j <= i; j++) {
          System.out.print("* ");
        }
        // New Line
        System.out.println();
      }
    // 2. Second Part Horizontal Line
      // Print Space from 1 to (int)n/2
      for(int j = 1; j <= (int)n/2; j++) {
        System.out.print("  ");
      }
      // Print e from 1 to n+2
      for(int j = 1; j <= n+2; j++) {
        System.out.print("e ");
      }
      // Print star 1 to (n+1)/2
      for(int j = 1; j <= (n+2)/2; j++) {
        System.out.print("* ");
      }
      // New Line
      System.out.println();
    // 3. Below Horizontal Line
      // Row from 1 to (int)n/2
      for(int i = 1; i <= (int)n/2; i++) {
        // Print space from 1 to (int)n/2
        for(int j = 1; j <= (int)n/2; j++) {
          System.out.print("  ");
        }
        // Print e
        System.out.print("e ");
        // Print Space from 1 to n+1
        for(int j = 1; j <= n+1; j++) {
          System.out.print("  ");
        }
        // Print star from 1 to (n+1)/2 - i
        for(int j = 1; j <= (n+1)/2 - i; j++) {
          System.out.print("* ");
        }
        // New Line
        System.out.println();
      }
    // 4. Vertical Line
      // Row from 1 to (n+3) - (int)n/2
      for(int i = 1; i <= (n+3) - (int)n/2; i++) {
        // Print Space from 1 to (int)n/2
        for(int j = 1; j <= (int)n/2; j++) {
          System.out.print("  ");
        }
        // Print e
        System.out.println("e");
      }
    // 5. Root Part
      // Print star from 1 to n
      for(int i = 1; i <= n; i++) {
        System.out.print("* ");
      }
  }
}
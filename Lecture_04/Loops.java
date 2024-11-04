public class Loops {
  public static void main(String[] args) {
    // For Loop
    for(int i = 1; i <= 10; i++) {
      System.out.print(i + " ");
    }
    // While Loop
    int i = 1;
    while(i <= 10) {
      System.out.print(i + " ");
      i++;
    }
    // do-while loop
    i = 1;
    do {
      System.out.print(i + " ");
      i++;
    } while(i <= 10);
  }
}
public class CheckingDataTypes {
  public static void main(String[] args) {
    //# Checking Data types of primitive variables
    // 1. byte :: Size: 1 byte | Range: -2^7 to 2^7-1 | default: 0
    byte a = 127;
    System.out.println(a);

    // 2. short :: Size: 2 byte | Range: -2^15 to 2^15-1 | default: 0 
    short b = 32767;
    System.out.println(b);

    // 3. int :: size: 4 byte | Range: -2^31 to 2^31 - 1 | default: 0
    int c = 2147483647;
    System.out.println(c);

    // 4. long :: size: 8 byte | Range: -2^63 to 2^63 - 1 | default: 0L
    long d = 9223372036854775807L;
    System.out.println(d);

    // 5. float :: size: 4 byte | Range: +- 3.4e38 | default : 0.0f | 7 decimal digits for precision
    float e = 3.141592653589793f;
    System.out.println(e);

    // 6. double :: size: 8 byte | Range: +- 1.7e308 | default : 0.0d |15 decimal digits for precision
    double f = 3.141592653589793d;
    System.out.println(f);

    // 7. char :: size: 2 byte | Range: 0 to 65535 (Unicode Value) | default: "\u0000";
    char g = 99;
    System.out.println(g);

    // 8. boolean :: size: 1 bit | Value true or false 
    boolean h = true;
    System.out.println(h);

    // ## Checking Data Types of an object using instanceOf
    // 1. String
    String str = "Hello";
    System.out.println(str.getClass());

    // ## Wrapper classes: These classes provides 
    

  }
}
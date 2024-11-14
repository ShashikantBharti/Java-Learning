import java.text.NumberFormat;
import java.util.Locale;

class CurrencyPractice {
  public static void main(String[] args) {
    double amount = 12345.67;

    // Get the currency format for a specific locale e.g. US
    NumberFormat usCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
    String formatedAmount = usCurrencyFormatter.format(amount);
    System.out.println("US Locale Currency: " + formatedAmount);

    // Get the currency format for a specific locale e.g. CHINA
    NumberFormat chinaCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
    formatedAmount = chinaCurrencyFormatter.format(amount);
    System.out.println("China Locale Currency: " + formatedAmount);

    // Get the currency format for a specific locale e.g. JAPAN
    NumberFormat japanCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.JAPAN);
    formatedAmount = japanCurrencyFormatter.format(amount);
    System.out.println("Japan Locale Currency: " + formatedAmount);

    
    // Get the currency format for a specific locale e.g. FRANCE
    NumberFormat franceCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    formatedAmount = franceCurrencyFormatter.format(amount);
    System.out.println("France Locale Currency: " + formatedAmount);

    
    // Get the currency format for a specific locale e.g. INDIA
    NumberFormat indianCurrencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    formatedAmount = indianCurrencyFormatter.format(amount);
    System.out.println("Indian Locale Currency: " + formatedAmount);

    System.out.println(Locale.US);
    System.out.println(Locale.CHINA);
    System.out.println(Locale.FRANCE);
    System.out.println(Locale.JAPAN);
    System.out.println(new Locale("en", "IN"));

  }
}
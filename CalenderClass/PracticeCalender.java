import java.util.Calendar;

public class PracticeCalender {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 2015);
    calendar.set(Calendar.MONTH, 8-1);
    calendar.set(Calendar.DAY_OF_MONTH, 05);

    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

    switch(dayOfWeek) {
      case Calendar.SUNDAY: System.out.println("SUNDAY"); break;
      case Calendar.MONDAY: System.out.println("MONDAY"); break;
      case Calendar.TUESDAY: System.out.println("TUESDAY"); break;
      case Calendar.WEDNESDAY: System.out.println("WEDNESDAY"); break;
      case Calendar.THURSDAY: System.out.println("THURSDAY"); break;
      case Calendar.FRIDAY: System.out.println("FRIDAY"); break;
      case Calendar.SATURDAY: System.out.println("SATURDAY"); break;
      default: System.out.println("Invalid Input");
    }

    System.out.println(Calendar.AUGUST);

  }
}
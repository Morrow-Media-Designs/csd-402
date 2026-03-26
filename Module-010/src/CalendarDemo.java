import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Now: " + cal.getTime());

        // create a specific date: 1 Jan 2020
        Calendar cal2 = new GregorianCalendar(2020, Calendar.JANUARY, 1);
        System.out.println("Start of 2020: " + cal2.getTime());

        // add 10 days
        cal2.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("10 days later: " + cal2.getTime());
    }
}

/*
 *
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Mod10_Cloned_Calendar {

    public static void main(String[] args) {

        Calendar originalDate = new GregorianCalendar(2025, Calendar.NOVEMBER, 11);
        System.out.println("\nToday's Date: " + originalDate.getTime());

        // Clone the Calendar object
        Calendar clonedDate = (Calendar) originalDate.clone();

        // Adding 44 days to cloned calendar (Nov. 11th + 44 Days = Dec 25th)
        clonedDate.add(Calendar.DAY_OF_MONTH, 44);
        System.out.println("Cloned Date 11/11/25 +44 days to Christmas: " + clonedDate.getTime());

        System.out.println();
        System.out.println("Showing the originalDate unchanged: " + originalDate.getTime());
    }
}

/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Calendar and Cloneable Example
 *
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Example_2_13 {

    public static void main(String[] args) {

        Calendar today = new GregorianCalendar(2025, Calendar.NOVEMBER, 11);
        System.out.println("Original Date: " + today.getTime());

        // Clone the Calendar object
        Calendar clonedDate = (Calendar) today.clone();

        // Add 10 days to cloned calendar
        clonedDate.add(Calendar.DAY_OF_MONTH, 44);
        System.out.println("Cloned Date from Nov. 11th +46 days to Christmas: " + clonedDate.getTime());

        System.out.println();
        System.out.println("Original still unchanged: " + today.getTime());
    }
}

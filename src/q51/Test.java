package q51;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        var d1 = new java.util.Date();
        var event = new Event(d1);
        System.out.println("No update: " +event.getDate());

        d1.setTime(Calendar.getInstance().getTimeInMillis() + 600000);
        System.out.println("Update d1: " +event.getDate());

        event.getDate().setTime(Calendar.getInstance().getTimeInMillis() + 600000);
        System.out.println("Update event d1: " +event.getDate());

        // Use LocalDate (immutable class) instead of Date or
        // Change the constructor and getter method of Event class to manually create copies of Date object.
    }
}

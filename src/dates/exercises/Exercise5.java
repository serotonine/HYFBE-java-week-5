package dates.exercises;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

/**
 * Exercise 5: Date Comparisons and Advanced Operations
 * 
 * Scenario: You're building a booking system that needs to validate and manipulate dates
 * 
 * TODO: Complete the following tasks
 * 
 * 1. Create a method that checks if a given date is in the past
 * 2. Create a method that checks if a date falls on a weekend (Saturday or Sunday)
 * 3. Compare three dates and find which one is the earliest
 * 4. Calculate the number of days between today and Christmas (Dec 25, 2026)
 * 5. Find the first and last day of the current month
 * 6. Find the next Monday from today
 * 7. Create a method that finds the first Friday of next month
 * 8. BONUS: Create a method that checks if a booking period (start and end date) 
 *    overlaps with another booking period
 */
public class Exercise5 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        
        // TODO: Task 1 - Test the isPast method
        LocalDate testDate1 = LocalDate.of(2020, 1, 1);
        LocalDate testDate2 = LocalDate.of(2030, 12, 31);
        System.out.println("Is 2020-01-01 in the past? " + isPast(testDate1));
        System.out.println("Is 2030-12-31 in the past? " + isPast(testDate2));
        
        
        // TODO: Task 2 - Test the isWeekend method
        System.out.println("Is today a weekend? " + isWeekend(today));
        
        
        // TODO: Task 3 - Find the earliest date
        LocalDate date1 = LocalDate.of(2026, 5, 15);
        LocalDate date2 = LocalDate.of(2026, 3, 20);
        LocalDate date3 = LocalDate.of(2026, 8, 10);
        // Find and print the earliest date
        
        
        // TODO: Task 4 - Days until Christmas
        LocalDate christmas = LocalDate.of(2026, 12, 25);
        
        
        // TODO: Task 5 - First and last day of current month
        
        
        // TODO: Task 6 - Next Monday
        
        
        // TODO: Task 7 - Test the firstFridayOfNextMonth method
        LocalDate firstFriday = firstFridayOfNextMonth();
        System.out.println("First Friday of next month: " + firstFriday);
        
        
        // TODO: BONUS - Test booking overlap
        LocalDate booking1Start = LocalDate.of(2026, 4, 10);
        LocalDate booking1End = LocalDate.of(2026, 4, 15);
        LocalDate booking2Start = LocalDate.of(2026, 4, 14);
        LocalDate booking2End = LocalDate.of(2026, 4, 20);
        
        System.out.println("Do bookings overlap? " + 
            bookingsOverlap(booking1Start, booking1End, booking2Start, booking2End));
    }
    
    /**
     * TODO: Task 1 - Implement this method
     * Checks if the given date is in the past
     * 
     * @param date The date to check
     * @return true if the date is before today, false otherwise
     */
    public static boolean isPast(LocalDate date) {
        // Your code here
        return false;
    }
    
    /**
     * TODO: Task 2 - Implement this method
     * Checks if the given date falls on a weekend (Saturday or Sunday)
     * 
     * @param date The date to check
     * @return true if weekend, false otherwise
     */
    public static boolean isWeekend(LocalDate date) {
        // Your code here
        // Hint: use date.getDayOfWeek() and compare with DayOfWeek.SATURDAY and SUNDAY
        return false;
    }
    
    /**
     * TODO: Task 7 - Implement this method
     * Finds the first Friday of next month
     * 
     * @return LocalDate of the first Friday of next month
     */
    public static LocalDate firstFridayOfNextMonth() {
        // Your code here
        // Hint: use plusMonths(1), with(TemporalAdjusters.firstDayOfMonth()), 
        //       and with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY))
        return null;
    }
    
    /**
     * TODO: BONUS - Implement this method
     * Checks if two booking periods overlap
     * 
     * @param start1 Start date of first booking
     * @param end1 End date of first booking
     * @param start2 Start date of second booking
     * @param end2 End date of second booking
     * @return true if bookings overlap, false otherwise
     */
    public static boolean bookingsOverlap(LocalDate start1, LocalDate end1, 
                                          LocalDate start2, LocalDate end2) {
        // Your code here
        // Hint: Bookings overlap if start1 <= end2 AND start2 <= end1
        return false;
    }
}

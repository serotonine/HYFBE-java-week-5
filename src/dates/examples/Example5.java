package dates.examples;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * Example 5: Date Comparisons and Advanced Operations
 * 
 * This example demonstrates:
 * - Comparing dates (before, after, equal)
 * - Calculating differences between dates
 * - Using 'with' methods to modify dates
 * - Using TemporalAdjusters for complex date operations
 */
public class Example5 {
    public static void main(String[] args) {
        System.out.println("=== DATE COMPARISONS ===\n");
        
        LocalDate today = LocalDate.now();
        LocalDate pastDate = LocalDate.of(2020, 1, 1);
        LocalDate futureDate = LocalDate.of(2030, 12, 31);
        
        System.out.println("Today: " + today);
        System.out.println("Past date: " + pastDate);
        System.out.println("Future date: " + futureDate);
        
        System.out.println("\n--- isBefore / isAfter / isEqual ---");
        System.out.println("Is past date before today? " + pastDate.isBefore(today));
        System.out.println("Is future date after today? " + futureDate.isAfter(today));
        System.out.println("Is today equal to today? " + today.isEqual(today));
        
        System.out.println("\n--- compareTo ---");
        System.out.println("Today compared to past: " + today.compareTo(pastDate)); // positive
        System.out.println("Past compared to today: " + pastDate.compareTo(today)); // negative
        System.out.println("Today compared to today: " + today.compareTo(today)); // zero
        
        System.out.println("\n\n=== CALCULATING DIFFERENCES ===\n");
        
        LocalDate startDate = LocalDate.of(2026, 1, 1);
        LocalDate endDate = LocalDate.of(2026, 12, 31);
        
        System.out.println("Start: " + startDate);
        System.out.println("End: " + endDate);
        
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long weeksBetween = ChronoUnit.WEEKS.between(startDate, endDate);
        long monthsBetween = ChronoUnit.MONTHS.between(startDate, endDate);
        
        System.out.println("\nDifference:");
        System.out.println("Days: " + daysBetween);
        System.out.println("Weeks: " + weeksBetween);
        System.out.println("Months: " + monthsBetween);
        
        System.out.println("\n--- Real example: Days until birthday ---");
        LocalDate birthday = LocalDate.of(2026, 6, 15);
        long daysUntilBirthday = ChronoUnit.DAYS.between(today, birthday);
        System.out.println("Days until birthday (June 15): " + daysUntilBirthday);
        
        System.out.println("\n\n=== WITH METHODS (Modifying Dates) ===\n");
        
        LocalDate date = LocalDate.of(2026, 3, 15);
        System.out.println("Original date: " + date);
        
        System.out.println("\n--- Changing specific fields ---");
        System.out.println("With year 2030: " + date.withYear(2030));
        System.out.println("With month December: " + date.withMonth(12));
        System.out.println("With day 1: " + date.withDayOfMonth(1));
        System.out.println("With day of year 100: " + date.withDayOfYear(100));
        
        System.out.println("\n\n=== TEMPORAL ADJUSTERS ===\n");
        
        LocalDate current = LocalDate.now();
        System.out.println("Current date: " + current);
        
        System.out.println("\n--- Month adjustments ---");
        System.out.println("First day of month: " + 
            current.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("Last day of month: " + 
            current.with(TemporalAdjusters.lastDayOfMonth()));
        
        System.out.println("\n--- Year adjustments ---");
        System.out.println("First day of year: " + 
            current.with(TemporalAdjusters.firstDayOfYear()));
        System.out.println("Last day of year: " + 
            current.with(TemporalAdjusters.lastDayOfYear()));
        
        System.out.println("\n--- Next/Previous day of week ---");
        System.out.println("Next Monday: " + 
            current.with(TemporalAdjusters.next(java.time.DayOfWeek.MONDAY)));
        System.out.println("Previous Friday: " + 
            current.with(TemporalAdjusters.previous(java.time.DayOfWeek.FRIDAY)));
        
        System.out.println("\n--- First/Last day of week in month ---");
        System.out.println("First Monday of month: " + 
            current.with(TemporalAdjusters.firstInMonth(java.time.DayOfWeek.MONDAY)));
        System.out.println("Last Friday of month: " + 
            current.with(TemporalAdjusters.lastInMonth(java.time.DayOfWeek.FRIDAY)));
    }
}

package dates.exercises;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 * Exercise 2: Date Arithmetic
 * 
 * Scenario: You are planning a project timeline
 *  Complete the following tasks
 * 
 * 1. Create a LocalDate for today (project start date)
 * 2. Calculate and print the date 7 days from today (Sprint 1 deadline)
 * 3. Calculate and print the date 2 weeks from today (Sprint 2 deadline)
 * 4. Calculate and print the date 1 month from today (Mid-project review)
 * 5. Calculate and print the date 3 months from today (Project end)
 * 6. Calculate a date that is 15 days before today (Pre-planning phase)
 * 7. Create a date 2 months and 10 days from today using chaining
 * 8. BONUS: Calculate the date of the last day of next month
 */
public class Exercise2 {
    public static void main(String[] args) {
        // Task 1 - Create today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // Task 2 - Sprint 1 deadline (7 days)
        LocalDate sp1DeadLine = today.plusDays(7);
        System.out.println("Sprint 1 deadline: " + sp1DeadLine);
        long nbDays = sp1DeadLine.toEpochDay() - today.toEpochDay();
        System.out.println("How many days before  Sprint 1 deadline? " + nbDays + " days.");
        System.out.println("=".repeat(20));

        // Task 3 - Sprint 2 deadline (2 weeks)
        LocalDate sp2DeadLine = today.plusWeeks(2);
        System.out.println("Sprint 2 deadline: " + sp2DeadLine);
        nbDays = sp2DeadLine.toEpochDay() - today.toEpochDay();
        System.out.println("How many days before  Sprint 2 deadline? " + nbDays + " days.");
        System.out.println("=".repeat(20));
        
        // Task 4 - Mid-project review (1 month)
        LocalDate midReview = today.plusMonths(1);
        System.out.println("Mid-project review: " + midReview);
        nbDays = midReview.toEpochDay() - today.toEpochDay();
        System.out.println("How many days before the Mid-project review? " + nbDays + " days.");
        System.out.println("=".repeat(20));

        // Task 5 - Project end (3 months)
        LocalDate endOfP = today.plusMonths(3);
        System.out.println("Project end: " + endOfP);
        nbDays =endOfP.toEpochDay() - today.toEpochDay();
        System.out.println("How many days before the end of the project? " + nbDays + " days.");
        System.out.println("=".repeat(20));
        
        // Task 6 - Pre-planning phase (15 days before today)
        LocalDate preP = today.minusDays(15);
        System.out.println("Pre-planning phase: " + preP);
        System.out.println("How many days before?" + Period.between(today,preP).getDays() + " days.");
        System.out.println("=".repeat(20));

        // Task 7 - 2 months and 10 days from today
        LocalDate holidays = today.plusMonths(2).plusDays(10);
        System.out.println("My holidays: " + holidays);
        nbDays = holidays.toEpochDay() - today.toEpochDay();
        System.out.println("How many days before my holidays? " + nbDays + " days.");
        
        
        // TODO: BONUS - Last day of next month (Hint: use TemporalAdjusters)
       LocalDate bonus = today.plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of next month: " + (bonus.getDayOfWeek()).toString().toLowerCase());
        
    }
}
